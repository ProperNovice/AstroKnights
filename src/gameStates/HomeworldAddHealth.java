package gameStates;

import gameStatesDefault.GameState;
import managers.Model;

public class HomeworldAddHealth extends GameState {

	@Override
	public void execute() {

		Model.INSTANCE.addHealthToHomeworld();
		proceedToNextGameState();

	}

}
