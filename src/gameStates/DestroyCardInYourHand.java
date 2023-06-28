package gameStates;

import managers.ListsManager;

public class DestroyCardInYourHand extends ADestroyCard {

	@Override
	protected void setUpListsEligibleToDestroyCards() {
		super.lists.addLast(ListsManager.INSTANCE.hand);
	}

}
