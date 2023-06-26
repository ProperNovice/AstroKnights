package cards;

public abstract class CardPlayer extends Card {

	@Override
	protected String getFileName() {

		String fileName = "cards/";
		fileName += this.getClass().getSimpleName().substring(4);
		fileName += ".png";
		return fileName;

	}

}
