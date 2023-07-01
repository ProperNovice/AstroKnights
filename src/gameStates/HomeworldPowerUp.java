package gameStates;

import gameStatesDefault.GameState;
import models.Homeworld;

public class HomeworldPowerUp extends GameState {

	@Override
	public void execute() {

		Homeworld.INSTANCE.powerUpOnce();

	}

}
