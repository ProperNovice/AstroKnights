package listCredentials;

import managers.Credentials;
import utils.Enums.LayerZListEnum;

public class ListCredentialsDeck extends ListCredentials {

	public ListCredentialsDeck() {

		super.coordinatesList = Credentials.INSTANCE.cDeck;
		super.objectsPerRow = 1;
		super.gapBetweenComponents.y = Credentials.INSTANCE.dCard.y * 0.3;
		super.layerZListEnum = LayerZListEnum.TO_FRONT_FIRST_IMAGEVIEW;

	}

}
