package cards;

import interfaces.IAbility;
import interfaces.ICardType;
import interfaces.ICost;

public abstract class CardPlayer extends Card implements ICardType, ICost, IAbility {

	public CardPlayer() {
		setUpCardType();
	}

	@Override
	protected String getFileName() {

		String fileName = "cards/";
		fileName += this.getClass().getSimpleName().substring(4);
		fileName += ".png";
		return fileName;

	}

	protected abstract void setUpCardType();

}
