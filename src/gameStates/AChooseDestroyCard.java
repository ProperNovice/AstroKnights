package gameStates;

import enums.EText;
import gameStatesDefault.GameState;

public abstract class AChooseDestroyCard extends GameState {

	@Override
	public void execute() {

		EText.DESTROY_CARD.show();
		EText.SKIP.show();

	}

	@Override
	protected void executeTextOption(EText eText) {

		if (eText.equals(EText.DESTROY_CARD))
			getFlow().addFirst(getDestroyGameStateToProceed());

		proceedToNextGameState();

	}

	protected abstract Class<? extends GameState> getDestroyGameStateToProceed();

}
