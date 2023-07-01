package models;

import managers.NumberIndicator;

public enum Energy {

	INSTANCE;

	private NumberIndicator energy = new NumberIndicator("Energy", -1, 0, 600, 225);

	private Energy() {

	}

	public void addEnergy() {

		this.energy.addOne();

	}

}
