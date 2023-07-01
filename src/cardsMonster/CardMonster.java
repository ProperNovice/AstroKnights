package cardsMonster;

import models.Card;

public abstract class CardMonster extends Card {

	@Override
	protected String getFolderName() {
		return "monster";
	}

}
