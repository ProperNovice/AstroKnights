package managers;

import listCredentials.ListCredentialsBoard;
import listCredentials.ListCredentialsDeck;
import listCredentials.ListCredentialsDiscardPile;
import listCredentials.ListCredentialsHand;
import models.Card;
import utils.ArrayList;
import utils.Interfaces.IImageViewAble;
import utils.ListImageViewAbles;

public enum ListsManager {

	INSTANCE;

	public final ArrayList<ListImageViewAbles<IImageViewAble>> lists = new ArrayList<ListImageViewAbles<IImageViewAble>>();
	public ListImageViewAbles<Card> deck, discardPile, hand, board;

	public void instantiate() {

		this.deck = new ListImageViewAbles<>(ListCredentialsDeck.class);
		this.discardPile = new ListImageViewAbles<>(ListCredentialsDiscardPile.class);
		this.hand = new ListImageViewAbles<>(ListCredentialsHand.class);
		this.board = new ListImageViewAbles<>(ListCredentialsBoard.class);

	}

	public void saveListsOriginal() {

		for (ListImageViewAbles<IImageViewAble> list : this.lists)
			list.getArrayList().saveOriginal();

	}

	public void loadListsOriginal() {

		for (ListImageViewAbles<IImageViewAble> list : this.lists)
			list.getArrayList().clear();

		for (ListImageViewAbles<IImageViewAble> list : this.lists)
			list.getArrayList().loadOriginal();

	}

}
