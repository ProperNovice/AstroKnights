package gameStates;

import enums.EText;
import gameStatesDefault.GameState;
import managers.ListsManager;
import managers.Model;
import models.Card;

public class ChooseMinionToDefeat extends GameState {

	@Override
	public void execute() {

		if (ListsManager.INSTANCE.minions.getArrayList().size() == 1)
			handleCardPressedMonsters(ListsManager.INSTANCE.minions.getArrayList().getFirst());

		else
			EText.CHOOSE_A_MINION_TO_DEFEAT.show();

	}

	@Override
	protected void handleCardPressedMonsters(Card card) {

		Model.INSTANCE.destroyCard(card, ListsManager.INSTANCE.minions);
		proceedToNextGameState();

	}

}
