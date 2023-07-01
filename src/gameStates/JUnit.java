package gameStates;

import java.lang.reflect.InvocationTargetException;

import cardsPlayer.Card001;
import cardsPlayer.Card002;
import cardsPlayer.Card004;
import cardsPlayer.Card007;
import cardsPlayer.CardPlayer;
import gameStatesDefault.GameState;
import interfaces.IAbility;
import javafx.scene.input.KeyCode;
import managers.ListsManager;
import models.Card;
import models.Energy;
import models.Homeworld;
import models.Player;
import utils.ListImageViewAbles;

public class JUnit extends GameState {

	@Override
	public void execute() {

		Energy.values();
		Homeworld.values();
		Player.values();

		addCardToDeck(Card001.class, 1);
		addCardToDiscardPile(Card002.class, 6);
		addCardToHand(Card002.class, 1);
		addCardToHand(Card004.class, 1);
		addCardToBoard(Card001.class, 1);

	}

	@Override
	protected void handleKeyPressed(KeyCode keyCode) {

		resolveCardWhenPlay(Card007.class);

		proceedToNextGameState();

	}

	public void resolveCardWhenPlay(Class<? extends CardPlayer> classCard) {

		addCardToBoard(classCard, 1);

		Card card = ListsManager.INSTANCE.board.getArrayList().getLast();
		IAbility iAbility = (IAbility) card;
		iAbility.resolveWhenPlay();

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
