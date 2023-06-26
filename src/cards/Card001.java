package cards;

import cardType.CardTypeFuel;
import gameStates.ChooseDestroyACardInYourHandOrDiscardPile;
import gameStates.ChooseDrawAndDiscardCard;
import utils.Flow;

public class Card001 extends CardPlayer {

	@Override
	protected void setUpCardType() {
		new CardTypeFuel(this);
	}

	@Override
	public int getCost() {
		return 3;
	}

	@Override
	public void resolveWhenPlay() {

		Flow.INSTANCE.getFlow().addAllFirst(ChooseDestroyACardInYourHandOrDiscardPile.class,
				ChooseDrawAndDiscardCard.class);

	}

}
