package cardsPlayer;

import cardType.CardTypeTech;
import gameStates.ChooseSufferOneDamageToDefeatMinionOrDrawTwoCards;
import utils.Flow;

public class Card009 extends CardPlayer {

	@Override
	public int getCost() {
		return 7;
	}

	@Override
	protected void setUpCardType() {
		new CardTypeTech(this);
	}

	@Override
	public void resolveWhenPlay() {
		Flow.INSTANCE.getFlow().addFirst(ChooseSufferOneDamageToDefeatMinionOrDrawTwoCards.class);
	}

}
