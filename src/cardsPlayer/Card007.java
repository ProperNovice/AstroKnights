package cardsPlayer;

import cardType.CardTypeTech;
import gameStates.HomeworldPowerUp;
import utils.Flow;

public class Card007 extends CardPlayer {

	@Override
	public int getCost() {
		return 5;
	}

	@Override
	protected void setUpCardType() {
		new CardTypeTech(this);
	}

	@Override
	public void resolveWhenPlay() {

		for (int counter = 1; counter <= 2; counter++)
			Flow.INSTANCE.getFlow().addFirst(HomeworldPowerUp.class);

	}

}
