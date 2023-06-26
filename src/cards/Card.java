package cards;

import utils.ImageView;

public abstract class Card {

	public Card() {

		createImageView();

	}

	private void createImageView() {

		new ImageView(getFileName(), this);

	}

	private String getFileName() {

		String fileName = "cards/";
		fileName += this.getClass().getSimpleName().substring(4);
		fileName += ".png";
		return fileName;

	}

}
