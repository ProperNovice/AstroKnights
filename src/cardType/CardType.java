package cardType;

import interfaces.ICardType;
import utils.ArrayList;

public abstract class CardType {

	public CardType(ICardType iCardType) {

		if (!ICardType.cardType.containsKey(iCardType))
			ICardType.cardType.put(iCardType, new ArrayList<>());

		ICardType.cardType.getValue(iCardType).addLast(this.getClass());

	}

}
