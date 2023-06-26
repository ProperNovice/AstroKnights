package gameStates;

import java.lang.reflect.InvocationTargetException;

import cardType.CardTypeFuel;
import cardType.CardTypeTech;
import cardType.CardTypeWeapon;
import cards.Card;
import cards.Card001;
import gameStatesDefault.GameState;
import interfaces.ICardType;
import interfaces.ICost;

public class JUnit extends GameState {

	@Override
	public void execute() {

		handleCard(Card001.class);

	}

	public void handleCard(Class<? extends Card> cardClass) {

		Card card = null;

		try {
			card = cardClass.getConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		ICost iCost = (ICost) card;
		System.out.println("card cost -> " + iCost.getCost());
		System.out.println();

		ICardType iCardType = (ICardType) card;
		System.out.println("is card type");
		System.out.println("fuel -> " + iCardType.isCardType(CardTypeFuel.class));
		System.out.println("tech -> " + iCardType.isCardType(CardTypeTech.class));
		System.out.println("weapon -> " + iCardType.isCardType(CardTypeWeapon.class));

	}

}
