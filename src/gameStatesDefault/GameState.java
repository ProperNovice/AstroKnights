package gameStatesDefault;

import enums.EText;
import javafx.scene.input.KeyCode;
import managers.ListsManager;
import models.Card;
import utils.ArrayList;
import utils.Flow;
import utils.KeyCodeHandler;
import utils.Logger;
import utils.TextManager;

public abstract class GameState {

	public abstract void execute();

	public final void handleTextOptionPressed(EText textEnum) {

		Logger.INSTANCE.log("text option executing");
		Logger.INSTANCE.logNewLine(textEnum);

		TextManager.INSTANCE.concealText();
		executeTextOption(textEnum);

	}

	public final void executeKeyPressed(KeyCode keyCode) {

		handleKeyPressed(keyCode);

		int keyCodeID = KeyCodeHandler.INSTANCE.getKeyCodeInt(keyCode);

		if (keyCodeID == -1)
			return;

		EText textEnumPressed = TextManager.INSTANCE.getTextEnumOptionPressed(keyCodeID);

		if (textEnumPressed == null)
			return;

		Logger.INSTANCE.log("executing key pressed -> " + keyCode);
		handleTextOptionPressed(textEnumPressed);

	}

	protected void handleKeyPressed(KeyCode keyCode) {

	}

	protected void executeTextOption(EText eText) {

	}

	protected final ArrayList<Class<? extends GameState>> getFlow() {
		return Flow.INSTANCE.getFlow();
	}

	protected final void proceedToNextGameState() {
		Flow.INSTANCE.proceed();
	}

	protected final void concealText() {
		TextManager.INSTANCE.concealText();
	}

	public final void handleCardPressed(Card card) {

		if (ListsManager.INSTANCE.hand.getArrayList().contains(card))
			handleCardPressedHand(card);
		else if (ListsManager.INSTANCE.board.getArrayList().contains(card))
			handleCardPressedBoard(card);
		else if (ListsManager.INSTANCE.deck.getArrayList().contains(card))
			handleCardPressedDeck(card);
		else if (ListsManager.INSTANCE.discardPile.getArrayList().contains(card))
			handleCardPressedDiscardPile(card);
		else if (ListsManager.INSTANCE.monsters.getArrayList().contains(card))
			handleCardPressedMonsters(card);

	}

	protected void handleCardPressedHand(Card card) {

	}

	protected void handleCardPressedBoard(Card card) {

	}

	protected void handleCardPressedDeck(Card card) {

	}

	protected void handleCardPressedDiscardPile(Card card) {

	}

	protected void handleCardPressedMonsters(Card card) {

	}

}
