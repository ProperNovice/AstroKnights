package cardsMinion;

import models.Card;

public abstract class CardMinion extends Card {

	@Override
	protected String getFolderName() {
		return "minion";
	}

}
