package enums;

import utils.Enums.TextTypeEnum;
import utils.TextManager;

public enum EText {

	CANCEL("Cancel", TextTypeEnum.OPTION),
	CONTINUE("Continue", TextTypeEnum.OPTION),
	RESTART("Restart", TextTypeEnum.OPTION),
	START_GAME("Start game", TextTypeEnum.OPTION),
	VOID("", TextTypeEnum.INDICATOR),
	YOU_LOST("You lost", TextTypeEnum.INDICATOR),
	YOU_WON("You won", TextTypeEnum.INDICATOR),
	DESTROY_CARD("Destroy card", TextTypeEnum.OPTION),
	SKIP("Skip", TextTypeEnum.OPTION),
	CHOOSE_A_CARD_TO_DESTROY("Choose a card to destroy", TextTypeEnum.INDICATOR),
	DRAW_AND_DISCARD("Draw and discard", TextTypeEnum.OPTION),
	CHOOSE_A_CARD_TO_DISCARD("Choose a card to discard", TextTypeEnum.INDICATOR),
	SUFFER_1_DMG_TO_DEFEAT_A_MINION("Suffer 1 damage to defeat a minion", TextTypeEnum.OPTION),
	DRAW_2_CARDS("Draw 2 cards", TextTypeEnum.OPTION),
	CHOOSE_A_MINION_TO_DEFEAT("Choose a minion to defeat", TextTypeEnum.INDICATOR),

	;

	private TextTypeEnum textTypeEnum = null;
	private String string = null;

	private EText(String string, TextTypeEnum textTypeEnum) {

		this.string = string;
		this.textTypeEnum = textTypeEnum;

	}

	public void show() {
		TextManager.INSTANCE.showText(this, getString());
	}

	public void showAdditionally(String string) {
		TextManager.INSTANCE.showText(this, getString() + string);
	}

	public void showAdditionally(int integer) {
		showAdditionally(Integer.toString(integer));
	}

	public void showInstead(String string) {
		TextManager.INSTANCE.showText(this, string);
	}

	public String getString() {
		return this.string;
	}

	public TextTypeEnum getTextTypeEnum() {
		return this.textTypeEnum;
	}

}
