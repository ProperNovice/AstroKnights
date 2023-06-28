package models;

import utils.TextIndicator;

public enum Energy {

	INSTANCE;

	private TextIndicator textIndicator = new TextIndicator();
	private int energy = 0;

	private Energy() {

		updateText();

	}

	public void addEnergyUpdateText(int amount) {

		this.energy += amount;
		updateText();

	}

	private void updateText() {

		String text = "";
		text += this.energy;
		text += " energy";
		this.textIndicator.setText(text);

	}

}
