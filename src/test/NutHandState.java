package test;

public class NutHandState {
	public final static int HIGH_CARD = 0;
	public final static int ONE_PAIR = 1;
	public final static int TWO_PAIR = 2;
	public final static int THREE_OF_A_KIND = 3;
	public final static int STRAIGHT = 4;
	public final static int FLUSH = 5;
	public final static int FULL_HOUSE = 6;
	public final static int FOUR_OF_A_KIND = 7;
	public final static int STRAIGHT_FLUSH = 8;

	public static int getNutHandState(String nutHandMsg) {
		if (nutHandMsg.equals("HIGH_CARD")) {
			return HIGH_CARD;
		} else if (nutHandMsg.equals("ONE_PAIR")) {
			return ONE_PAIR;
		} else if (nutHandMsg.equals("TWO_PAIR")) {
			return TWO_PAIR;
		} else if (nutHandMsg.equals("THREE_OF_A_KIND")) {
			return THREE_OF_A_KIND;
		} else if (nutHandMsg.equals("STRAIGHT")) {
			return STRAIGHT;
		} else if (nutHandMsg.equals("FLUSH")) {
			return FLUSH;
		} else if (nutHandMsg.equals("FULL_HOUSE")) {
			return FULL_HOUSE;
		} else if (nutHandMsg.equals("FOUR_OF_A_KIND")) {
			return FOUR_OF_A_KIND;
		} else if (nutHandMsg.equals("STRAIGHT_FLUSH")) {
			return STRAIGHT_FLUSH;
		} else {
			System.out.println("nutHandMsg is wrong");
			return -1;
		}
	}

	public static String setNutHandState(int nutHandMsg) {

		String nutHandString = "";
		switch (nutHandMsg) {
		case 0:
			nutHandString = "HIGH_CARD";
			break;
		case 1:
			nutHandString = "ONE_PAIR";
			break;
		case 2:
			nutHandString = "TWO_PAIR";
			break;
		case 3:
			nutHandString = "THREE_OF_A_KIND";
			break;
		case 4:
			nutHandString = "FLUSH";
			break;
		case 5:
			nutHandString = "FULL_HOUSE";
			break;
		case 6:
			nutHandString = "FOUR_OF_A_KIND";
			break;
		case 7:
			nutHandString = "STRAIGHT_FLUSH";
			break;
		default:
			break;
		}
		return nutHandString;
	}
}
