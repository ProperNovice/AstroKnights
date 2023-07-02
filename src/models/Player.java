package models;

import managers.NumberIndicator;

public enum Player {

	INSTANCE;

	private NumberIndicator powerIndicator, healthIndicator;

	private Player() {

		this.powerIndicator = new NumberIndicator("pl power", 5, 0, 600, 125);
		this.healthIndicator = new NumberIndicator("pl health", 10, 6, 600, 175);

	}

	public NumberIndicator getPowerIndicator() {
		return this.powerIndicator;
	}

	public NumberIndicator getHealthIndicator() {
		return this.healthIndicator;
	}

}
