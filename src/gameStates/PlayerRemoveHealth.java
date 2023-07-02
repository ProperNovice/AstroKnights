package gameStates;

import gameStatesDefault.GameState;
import managers.Model;

public class PlayerRemoveHealth extends GameState {

	@Override
	public void execute() {

		Model.INSTANCE.removeHealthFromPlayer();
		proceedToNextGameState();

	}

}
