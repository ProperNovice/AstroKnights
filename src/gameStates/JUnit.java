package gameStates;

import java.lang.reflect.InvocationTargetException;

import cards.Card;
import cards.Card001;
import gameStatesDefault.GameState;
import managers.ListsManager;
import utils.ListImageViewAbles;

public class JUnit extends GameState {

	@Override
	public void execute() {

		addCardToDeck(Card001.class, 4);
		addCardToDiscardPile(Card001.class, 6);
		addCardToHand(Card001.class, 3);
		addCardToBoard(Card001.class, 5);

	}

	public Card createCard(Class<? extends Card> cardClass) {

		Card card = null;

		try {
			card = cardClass.getConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		return card;

	}

	public void addCardToDeck(Class<? extends Card> cardClass, int amount) {
		addCardToList(cardClass, amount, ListsManager.INSTANCE.deck);
	}

	public void addCardToDiscardPile(Class<? extends Card> cardClass, int amount) {
		addCardToList(cardClass, amount, ListsManager.INSTANCE.discardPile);
	}

	public void addCardToHand(Class<? extends Card> cardClass, int amount) {
		addCardToList(cardClass, amount, ListsManager.INSTANCE.hand);
	}

	public void addCardToBoard(Class<? extends Card> cardClass, int amount) {
		addCardToList(cardClass, amount, ListsManager.INSTANCE.board);
	}

	private void addCardToList(Class<? extends Card> cardClass, int amount,
			ListImageViewAbles<Card> list) {

		for (int counter = 1; counter <= amount; counter++) {

			Card card = createCard(cardClass);
			list.getArrayList().addLast(card);

		}

		list.relocateImageViews();

	}

}
