package gameStates;

import gameStatesDefault.GameState;

public class ChooseDestroyCardInYourHand extends AChooseDestroyCard {

	@Override
	protected Class<? extends GameState> getDestroyGameStateToProceed() {
		return DestroyCardInYourHand.class;
	}

}
