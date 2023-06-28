package cardsPlayer;

import cardType.CardTypeFuel;
import gameStates.ChooseDestroyCardInYourHand;
import models.Homeworld;
import utils.Flow;

public class Card005 extends CardPlayer {

	@Override
	public int getCost() {
		return 4;
	}

	@Override
	protected void setUpCardType() {
		new CardTypeFuel(this);
	}

	@Override
	public void resolveWhenPlay() {

		Homeworld.INSTANCE.getPowerIndicator().addCurrentValue(1);
		Flow.INSTANCE.getFlow().addFirst(ChooseDestroyCardInYourHand.class);

	}

}
