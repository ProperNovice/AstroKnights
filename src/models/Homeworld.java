package models;

import managers.NumberIndicator;

public enum Homeworld {

	INSTANCE;

	private NumberIndicator powerIndicator, healthIndicator;

	private Homeworld() {

		this.powerIndicator = new NumberIndicator("Power", 2, 0, 400, 25);
		this.healthIndicator = new NumberIndicator("Health", 26, 0, 400, 75);

	}

	public NumberIndicator getPowerIndicator() {
		return this.powerIndicator;
	}

	public NumberIndicator getHealthIndicator() {
		return this.healthIndicator;
	}

}
