package managers;

import utils.TextIndicator;

public class NumberIndicator {

	private TextIndicator textIndicator = new TextIndicator();
	private String text = "";
	private int totalValue, startingValue, currentValue;

	public NumberIndicator(String text, int totalValue, int startingValue, double x, double y) {

		this.text = text;
		this.textIndicator.relocateTopLeft(x, y);
		this.totalValue = totalValue;
		this.startingValue = startingValue;
		this.currentValue = this.startingValue;

		updateIndicator();

	}

	public void addCurrentValue(int value) {
		this.currentValue = Math.min(this.currentValue + value, this.totalValue);
		updateIndicator();
	}

	private void updateIndicator() {

		String text = this.text;
		text += ": ";
		text += this.currentValue;
		text += "/";
		text += this.totalValue;
		this.textIndicator.setText(text);

	}

}
