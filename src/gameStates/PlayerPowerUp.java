package gameStates;

import gameStatesDefault.GameState;
import managers.Model;

public class PlayerPowerUp extends GameState {

	@Override
	public void execute() {

		Model.INSTANCE.powerUpPlayer();
		proceedToNextGameState();

	}

}
