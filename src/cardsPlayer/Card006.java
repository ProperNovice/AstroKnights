package cardsPlayer;

import cardType.CardTypeTech;
import gameStates.HomeworldPowerUp;
import gameStates.PlayerPowerUp;
import utils.Flow;

public class Card006 extends CardPlayer {

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

		Flow.INSTANCE.getFlow().addAllFirst(HomeworldPowerUp.class, PlayerPowerUp.class);

	}

}
