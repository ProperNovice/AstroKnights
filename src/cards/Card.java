package cards;

import managers.ListsManager;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;
import utils.ListImageViewAbles;

public abstract class Card implements IImageViewAble {

	public Card() {

		createImageView();

	}

	private void createImageView() {

		new ImageView(getFileName(), this);

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

}
