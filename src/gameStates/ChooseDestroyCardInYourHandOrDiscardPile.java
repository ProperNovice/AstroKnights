package gameStates;

import gameStatesDefault.GameState;

public class ChooseDestroyCardInYourHandOrDiscardPile extends AChooseDestroyCard {

	@Override
	protected Class<? extends GameState> getDestroyGameStateToProceed() {
		return DestroyCardInYourHandOrDiscardPile.class;
	}

}
