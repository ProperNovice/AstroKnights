package gameStates;

import gameStatesDefault.GameState;
import managers.Model;

public class HomeworldPowerUp extends GameState {

	@Override
	public void execute() {

		Model.INSTANCE.powerUpHomeworld();
		proceedToNextGameState();

	}

}
