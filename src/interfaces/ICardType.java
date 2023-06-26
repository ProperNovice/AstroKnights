package interfaces;

import cardType.CardType;
import utils.ArrayList;
import utils.HashMap;

public interface ICardType {

	public HashMap<ICardType, ArrayList<Class<? extends CardType>>> cardType = new HashMap<>();

	public default boolean isCardType(Class<? extends CardType> classCardType) {
		return cardType.getValue(this).contains(classCardType);
	}

}
