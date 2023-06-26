package managers;

import cards.Card;
import utils.ListImageViewAbles;
import utils.Logger;

public enum Model {

	INSTANCE;

	public void destroyCard(Card card, ListImageViewAbles<Card> list) {

		Logger.INSTANCE.logNewLine("destroy card");

		list.getArrayList().remove(card);
		card.getImageView().setVisible(false);
		list.relocateImageViews();

	}

	public void drawCard() {

		if (ListsManager.INSTANCE.deck.getArrayList().isEmpty())
			transferDiscardPileToDeck();

		Logger.INSTANCE.logNewLine("draw card");

		transferCardFromFirstToLast(ListsManager.INSTANCE.deck, ListsManager.INSTANCE.hand);

	}

	public void transferDiscardPileToDeck() {

		Logger.INSTANCE.logNewLine("transfering discard pile to deck");

		ListsManager.INSTANCE.deck.getArrayList()
				.addAllLast(ListsManager.INSTANCE.discardPile.getArrayList().clear());

		ListsManager.INSTANCE.deck.animateSynchronousLock();

	}

	private void transferCardFromFirstToLast(ListImageViewAbles<Card> from,
			ListImageViewAbles<Card> to) {

		Card card = from.getArrayList().removeFirst();
		to.getArrayList().addLast(card);

		from.relocateImageViews();
		to.relocateImageViews();

	}

	public void discardCardFromHand(Card card) {

		ListsManager.INSTANCE.hand.getArrayList().remove(card);
		ListsManager.INSTANCE.hand.relocateImageViews();
		ListsManager.INSTANCE.discardPile.getArrayList().addLast(card);
		ListsManager.INSTANCE.discardPile.relocateImageViews();

	}

}
