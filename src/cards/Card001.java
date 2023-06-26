package cards;

import cardType.CardTypeFuel;
import interfaces.ICardType;
import interfaces.ICost;

public class Card001 extends Card implements ICardType, ICost {

	public Card001() {
		new CardTypeFuel(this);
	}

	@Override
	public int getCost() {
		return 3;
	}

}
