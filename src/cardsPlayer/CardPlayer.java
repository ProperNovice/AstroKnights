package cardsPlayer;

import interfaces.IAbility;
import interfaces.ICardType;
import interfaces.ICost;
import models.Card;

public abstract class CardPlayer extends Card implements ICardType, ICost, IAbility {

	public CardPlayer() {
		setUpCardType();
	}

	@Override
	protected final String getFolderName() {
		return "player";
	}

	protected abstract void setUpCardType();

}
