package gameStates;

import managers.ListsManager;

public class DestroyCardInYourHandOrDiscardPile extends ADestroyCard {

	@Override
	protected void setUpListsEligibleToDestroyCards() {

		super.lists.addLast(ListsManager.INSTANCE.hand);
		super.lists.addLast(ListsManager.INSTANCE.discardPile);

	}

}
