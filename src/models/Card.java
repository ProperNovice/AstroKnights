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
		fileName += getFileName();
		new ImageView(fileName, this);

	}

	protected abstract String getFileName();

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
