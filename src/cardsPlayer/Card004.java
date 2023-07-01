package cardsPlayer;

import cardType.CardTypeTech;
import gameStates.HomeworldAddHealth;
import gameStates.HomeworldPowerUp;
import utils.Flow;

public class Card004 extends CardPlayer {

	@Override
	public int getCost() {
		return 4;
	}

	@Override
	protected void setUpCardType() {
		new CardTypeTech(this);
	}

	@Override
	public void resolveWhenPlay() {

		Flow.INSTANCE.getFlow().addAllFirst(HomeworldPowerUp.class,
				HomeworldAddHealth.class);

	}

}
