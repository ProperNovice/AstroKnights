package gameStates;

import enums.EText;
import gameStatesDefault.GameState;
import managers.ListsManager;
import managers.Model;
import models.Card;

public class DiscardCard extends GameState {

	@Override
	public void execute() {

		if (ListsManager.INSTANCE.hand.getArrayList().size() == 1)
			handleCardPressedHand(ListsManager.INSTANCE.hand.getArrayList().getFirst());
		else
			EText.CHOOSE_A_CARD_TO_DISCARD.show();

	}

	@Override
	protected void handleCardPressedHand(Card card) {

		concealText();
		Model.INSTANCE.discardCardFromHand(card);
		proceedToNextGameState();

	}

}
