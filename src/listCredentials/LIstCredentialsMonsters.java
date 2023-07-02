package listCredentials;

import managers.Credentials;

public class LIstCredentialsMonsters extends ListCredentials {

	public LIstCredentialsMonsters() {
		super.coordinatesList = Credentials.INSTANCE.cMonsters;
	}

}
