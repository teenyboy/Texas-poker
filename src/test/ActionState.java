package test;

public class ActionState {
	public final static int BLIND = 0;
	public final static int CHECK = 1;
	public final static int CALL = 2;
	public final static int RAISE = 3;
	public final static int ALL_IN = 4;
	public final static int FOLD = 5;

	public static int getActionState(String actionMsg) {
		if (actionMsg.equals("blind")) {
			return BLIND;
		} else if (actionMsg.equals("check")) {
			return CHECK;
		} else if (actionMsg.equals("call")) {
			return CALL;
		} else if (actionMsg.equals("raise")) {
			return RAISE;
		} else if (actionMsg.equals("all_in")) {
			return ALL_IN;
		} else if (actionMsg.equals("fold")) {
			return FOLD;
		} else {
			System.out.println("action is wrong");
			return -1;
		}
	}

	public static String setActionState(int action) {

		String actionStateString = "";

		switch (action) {
		case 0:
			actionStateString = "blind";
		case 1:
			actionStateString = "check";
			break;
		case 2:
			actionStateString = "call";
			break;
		case 3:
			actionStateString = "raise ";
			break;
		case 4:
			actionStateString = "all_in";
			break;
		case 5:
			actionStateString = "fold";
			break;
		default:
			actionStateString = "";
			break;
		}
		return actionStateString;
	}
}
