package listCredentials;

import managers.Credentials;

public class ListCredentialsBoard extends ListCredentials {

	public ListCredentialsBoard() {
		super.coordinatesList = Credentials.INSTANCE.cBoard;
	}

}
