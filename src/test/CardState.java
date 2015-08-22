package test;

public class CardState {

	public final static int SPADES = 0;
	public final static int HEARTS = 1;
	public final static int CLUBS = 2;
	public final static int DIAMONDS = 3;

	public int getCardColorState(String colorMsg) {
		if (colorMsg.equals("SPADES")) {
			return SPADES;
		} else if (colorMsg.equals("HEARTS")) {
			return HEARTS;
		} else if (colorMsg.equals("CLUBS")) {
			return CLUBS;
		} else if (colorMsg.equals("DIAMONDS")) {
			return DIAMONDS;
		} else {
			System.out.println("cardState 22 card color is wrong");
			return -1;
		}
	}

	public int getCardPointState(String pointMsg) {

		if (pointMsg.equals("K")) {
			return 13;
		} else if (pointMsg.equals("Q")) {
			return 12;
		} else if (pointMsg.equals("J")) {
			return 11;
		} else if (pointMsg.equals("A")) {
			return 14;
		} else if (Integer.valueOf(pointMsg) <= 10
				&& Integer.valueOf(pointMsg) >= 2) {
			return Integer.valueOf(pointMsg);
		} else {
			System.out.println("cardState 43 card point is wrong");
			return -1;
		}
	}

	public static String getColorContext(int color) {

		String context = "";

		switch (color) {
		case 0:
			context = "黑桃";
			break;
		case 1:
			context = "红桃";
			break;
		case 2:
			context = "梅花";
			break;
		case 3:
			context = "方片";
			break;

		default:
			break;
		}
		return context;
	}
}
