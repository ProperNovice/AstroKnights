package gameStates;

import enums.EText;
import gameStatesDefault.GameState;
import managers.ListsManager;
import managers.Model;
import models.Card;
import utils.ArrayList;
import utils.ListImageViewAbles;

public abstract class ADestroyCard extends GameState {

	protected ArrayList<ListImageViewAbles<Card>> lists = new ArrayList<>();

	@Override
	public void execute() {

		setUpListsEligibleToDestroyCards();
		EText.CHOOSE_A_CARD_TO_DESTROY.show();

	}

	@Override
	protected void handleCardPressedHand(Card card) {
		destroyCard(card, ListsManager.INSTANCE.hand);
	}

	@Override
	protected void handleCardPressedBoard(Card card) {
		destroyCard(card, ListsManager.INSTANCE.board);
	}

	@Override
	protected void handleCardPressedDeck(Card card) {
		destroyCard(card, ListsManager.INSTANCE.deck);
	}

	@Override
	protected void handleCardPressedDiscardPile(Card card) {
		destroyCard(card, ListsManager.INSTANCE.discardPile);
	}

	private void destroyCard(Card card, ListImageViewAbles<Card> list) {

		if (!this.lists.contains(list))
			return;

		Model.INSTANCE.destroyCard(card, list);
		concealText();
		proceedToNextGameState();

	}

	protected abstract void setUpListsEligibleToDestroyCards();

}
