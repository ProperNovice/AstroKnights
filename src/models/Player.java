package models;

import managers.NumberIndicator;

public enum Player {

	INSTANCE;

	private NumberIndicator powerIndicator, healthIndicator;

	private Player() {

		this.powerIndicator = new NumberIndicator("pl power", 5, 0, 600, 125);
		this.healthIndicator = new NumberIndicator("pl health", 10, 0, 600, 175);

	}

	public void powerUpOnce() {
		this.powerIndicator.addOne();
	}
	
	public void addHealth() {
		this.healthIndicator.addOne();
	}
	
	public void substractHealth() {
		
	}

}
