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
	protected final String getFileName() {

		String fileName = "player/";
		fileName += this.getClass().getSimpleName().substring(4);
		fileName += ".png";
		return fileName;

	}

	protected abstract void setUpCardType();

}
