package listCredentials;

import managers.Credentials;
import utils.Enums.LayerZListEnum;

public class ListCredentialsDiscardPile extends ListCredentials {

	public ListCredentialsDiscardPile() {

		super.coordinatesList = Credentials.INSTANCE.cDiscardPile;
		super.objectsPerRow = 1;
		super.gapBetweenComponents.y = Credentials.INSTANCE.dCard.y * 0.3;
		super.layerZListEnum = LayerZListEnum.TO_FRONT_FIRST_IMAGEVIEW;

	}

}
