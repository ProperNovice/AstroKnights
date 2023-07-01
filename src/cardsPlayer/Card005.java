package cardsPlayer;

import cardType.CardTypeFuel;
import gameStates.ChooseDestroyCardInYourHand;
import gameStates.HomeworldPowerUp;
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

		Flow.INSTANCE.getFlow().addAllFirst(HomeworldPowerUp.class,
				ChooseDestroyCardInYourHand.class);

	}

}
