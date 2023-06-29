package cardsPlayer;

import cardType.CardTypeTech;
import models.Homeworld;

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
		Homeworld.INSTANCE.powerUp(2);
	}

}
