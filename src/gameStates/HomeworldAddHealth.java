package gameStates;

import gameStatesDefault.GameState;
import models.Homeworld;

public class HomeworldAddHealth extends GameState {

	@Override
	public void execute() {

		Homeworld.INSTANCE.healthAddValueOnce();
		proceedToNextGameState();

	}

}
