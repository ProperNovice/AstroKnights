package models;

import managers.ListsManager;
import utils.Flow;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;
import utils.ListImageViewAbles;

public abstract class Card implements IImageViewAble {

	public Card() {

		createImageView();

	}

	private void createImageView() {

		String fileName = "cards/";

		fileName += getFolderName();
		fileName += "/";
		fileName += this.getClass().getSimpleName().substring(4);
		fileName += ".png";

		try {

			new ImageView(fileName, this);

		} catch (Exception exception) {

			System.out.println(fileName);

		}

	}

	protected abstract String getFolderName();

	@Override
	public final void handleMouseEntered() {
		getImageView().toFront();
	}

	@Override
	public final void handleMouseExited() {

		for (ListImageViewAbles<IImageViewAble> list : ListsManager.INSTANCE.lists)
			list.layerZSort();

	}

	@Override
	public void handleMousePressedPrimary() {
		Flow.INSTANCE.getGameStateCurrent().handleCardPressed(this);
	}

}
