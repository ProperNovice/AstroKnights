package managers;

import utils.Enums.RearrangeTypeEnum;
import utils.Vector2;

public enum Credentials {

	INSTANCE;

	public final String primaryStageTitle = "Astro Knights", numbersImageViewColor = "black";
	public final boolean colliderVisibility = true;
	public final double gapBetweenBorders = 25, textHeight = 50,
			selectEventHandlerAbleDimension = 100, animationStep = 4;
	public Vector2 dFrame, dGapBetweenComponents, dGapBetweenComponentsLineCast;
	public Vector2 cTextPanel, cImageViewIndicator;
	public RearrangeTypeEnum rearrangeTypeEnumText = RearrangeTypeEnum.LINEAR;

	public Vector2 dCard;
	public Vector2 cHand, cDeck, cDiscardPile, cBoard, cWeapons, cMonsters;

	private Credentials() {

		double x = 0, y = 0;

		this.dFrame = new Vector2(1920, 1368);
		this.dGapBetweenComponents = new Vector2(4, 4);
		this.dGapBetweenComponentsLineCast = this.dGapBetweenComponents;

		// c text panel

		this.cTextPanel = new Vector2(x, y);

		// c image view indicator

		x = this.gapBetweenBorders;
		y = this.gapBetweenBorders;
		this.cImageViewIndicator = new Vector2(x, y);

		// d card

		x = 184;
		y = 260;
		this.dCard = new Vector2(x, y);

		// c hand

		x = this.gapBetweenBorders;
		y = this.dFrame.y;
		y -= this.gapBetweenBorders;
		y -= this.dCard.y;
		this.cHand = new Vector2(x, y);

		// c board

		x = this.gapBetweenBorders;
		y = this.cHand.y;
		y -= this.dGapBetweenComponents.x;
		y -= this.dCard.y;
		this.cBoard = new Vector2(x, y);

		// c weapons

		x = this.gapBetweenBorders;
		y = this.cBoard.y;
		y -= this.dGapBetweenComponents.x;
		y -= this.dCard.y;
		this.cWeapons = new Vector2(x, y);

		// c minions

		x = this.gapBetweenBorders;
		y = this.cWeapons.y;
		y -= this.dGapBetweenComponents.x;
		y -= this.dCard.y;
		this.cMonsters = new Vector2(x, y);

		// c discard pile

		x = this.dFrame.x;
		x -= this.gapBetweenBorders;
		x -= this.dCard.x;
		y = this.gapBetweenBorders;
		this.cDiscardPile = new Vector2(x, y);

		// c deck

		x = this.cDiscardPile.x;
		x -= this.dGapBetweenComponents.x;
		x -= this.dCard.x;
		y = this.gapBetweenBorders;
		this.cDeck = new Vector2(x, y);

	}

}
