package gameStates;

import enums.EText;
import gameStatesDefault.GameState;
import managers.ListsManager;

public class ChooseSufferOneDamageToDefeatMinionOrDrawTwoCards extends GameState {

	@Override
	public void execute() {

		if (ListsManager.INSTANCE.minions.getArrayList().isEmpty())
			executeTextOption(EText.DRAW_2_CARDS);

		else {

			EText.SUFFER_1_DMG_TO_DEFEAT_A_MINION.show();
			EText.DRAW_2_CARDS.show();

		}

	}

	@Override
	protected void executeTextOption(EText eText) {

		switch (eText) {

		case SUFFER_1_DMG_TO_DEFEAT_A_MINION:
			getFlow().addAllFirst(PlayerRemoveHealth.class, ChooseMinionToDefeat.class);
			break;

		case DRAW_2_CARDS:
			getFlow().addFirst(DrawCard.class, 2);
			break;

		default:
			break;

		}

		proceedToNextGameState();

	}

}
