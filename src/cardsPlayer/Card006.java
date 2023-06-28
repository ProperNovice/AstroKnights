package cardsPlayer;

import cardType.CardTypeTech;
import models.Homeworld;
import models.Player;

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

		Homeworld.INSTANCE.getPowerIndicator().addCurrentValue(1);
		Player.INSTANCE.getPowerIndicator().addCurrentValue(1);

	}

}