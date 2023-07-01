package gameStates;

import gameStatesDefault.GameState;
import models.Player;

public class PlayerPowerUp extends GameState {

	@Override
	public void execute() {

		Player.INSTANCE.powerUpOnce();
		proceedToNextGameState();

	}

}
