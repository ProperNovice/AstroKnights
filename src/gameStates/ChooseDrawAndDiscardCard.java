package gameStates;

import enums.EText;
import gameStatesDefault.GameState;

public class ChooseDrawAndDiscardCard extends GameState {

	@Override
	public void execute() {

		EText.DRAW_AND_DISCARD.show();
		EText.SKIP.show();

	}

	@Override
	protected void executeTextOption(EText eText) {

		switch (eText) {

		case DRAW_AND_DISCARD:
			getFlow().addAllFirst(DrawCard.class, DiscardCard.class);
			break;

		case SKIP:
			break;

		default:
			break;

		}

		proceedToNextGameState();

	}

}
