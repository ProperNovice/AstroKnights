package gameStates;

import enums.EText;
import gameStatesDefault.GameState;

public class ChooseDestroyACardInYourHandOrDiscardPile extends GameState {

	@Override
	public void execute() {

		EText.DESTROY_CARD.show();
		EText.SKIP.show();

	}

	@Override
	protected void executeTextOption(EText eText) {

		if (eText.equals(EText.DESTROY_CARD))
			getFlow().addFirst(DestroyACardInYourHandOrDiscardPile.class);

		proceedToNextGameState();

	}

}
