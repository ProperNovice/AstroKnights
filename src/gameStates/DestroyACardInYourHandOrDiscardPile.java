package gameStates;

import enums.EText;
import gameStatesDefault.GameState;
import managers.ListsManager;
import managers.Model;
import models.Card;

public class DestroyACardInYourHandOrDiscardPile extends GameState {

	@Override
	public void execute() {
		EText.CHOOSE_A_CARD_TO_DESTROY.show();
	}

	@Override
	protected void handleCardPressedHand(Card card) {

		Model.INSTANCE.destroyCard(card, ListsManager.INSTANCE.hand);
		proceed();

	}

	@Override
	protected void handleCardPressedDiscardPile(Card card) {

		Model.INSTANCE.destroyCard(card, ListsManager.INSTANCE.discardPile);
		proceed();

	}

	private void proceed() {

		concealText();
		proceedToNextGameState();

	}

}
