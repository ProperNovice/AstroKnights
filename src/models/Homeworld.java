package models;

import managers.NumberIndicator;

public enum Homeworld {

	INSTANCE;

	private NumberIndicator powerIndicator, healthIndicator;

	private Homeworld() {

		this.powerIndicator = new NumberIndicator("hw power", 2, 0, 600, 25);
		this.healthIndicator = new NumberIndicator("hw health", 26, 0, 600, 75);

	}

	public void powerUpOnce() {
		this.powerIndicator.addOne();
	}

	public void healthAddValueOnce() {
		this.healthIndicator.addOne();
	}

}
