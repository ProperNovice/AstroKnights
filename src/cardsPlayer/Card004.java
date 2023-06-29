package cardsPlayer;

import cardType.CardTypeTech;
import models.Homeworld;

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

		Homeworld.INSTANCE.powerUp(1);
		Homeworld.INSTANCE.healthAddValue(1);

	}

}
