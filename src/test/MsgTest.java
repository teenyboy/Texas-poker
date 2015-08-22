package test;

import java.util.ArrayList;

public class MsgTest {

	ArrayList<Integer> testId = new ArrayList<Integer>();

	public MsgTest() {
		// TODO Auto-generated constructor stub
		testId.add(1111);
		testId.add(2222);
		testId.add(3333);
		testId.add(4444);
		testId.add(5555);
		testId.add(6666);
		testId.add(7777);
		testId.add(8888);
	}

	public void seatMsgTest() {

		String sb = "";
		// test
		for (int i = 0; i < testId.size(); i++) {
			sb = sb
					+ String.valueOf(Game.personHashMap.get(
							Integer.valueOf(testId.get(i))).getPid())
					+ String.valueOf(Game.personHashMap.get(
							Integer.valueOf(testId.get(i))).getJetton())
					+ String.valueOf(Game.personHashMap.get(
							Integer.valueOf(testId.get(i))).getMoney())
					+ "\r\n";
		}

		System.out.println("the seatMsg is" + sb + "end");
	}

	public void blindMsgTest() {
		String sb = "";
		// test
		sb = sb
				+ Competition.getInstance().getBigBlind()
				+ ":"
				+ String.valueOf(Game.personHashMap.get(
						Competition.getInstance().getBigBlind()).getBet())
				+ String.valueOf(Game.personHashMap.get(
						Competition.getInstance().getBigBlind()).isIsBigBlind())
				+ "\r\n";

		sb = sb
				+ Competition.getInstance().getSmallBlind()
				+ ":"
				+ String.valueOf(Game.personHashMap.get(
						Competition.getInstance().getSmallBlind()).getBet())
				+ String.valueOf(Game.personHashMap.get(
						Competition.getInstance().getBigBlind())
						.isIsSmallBlind()) + "\r\n";

		sb = sb + "big is " + Competition.getInstance().getBigBlind()
				+ "small is" + Competition.getInstance().getSmallBlind();

		System.out.println("the blind is" + sb + "end");
	}

	public void holdMsgTest() {
		String sb = "";

		ArrayList<Card> cards = Game.personHashMap.get(Game.my_id).getHold();

		for (int i = 0; i < cards.size(); i++) {
			sb = sb + "point:" + cards.get(i).getPoint() + "color:"
					+ cards.get(i).getColor();
		}

		System.out.println("the hold is" + sb + "end");
	}

	public void flopMsgTest() {
		String sb = "";

		ArrayList<Card> cards = Competition.getInstance().getFlopCards();

		for (int i = 0; i < cards.size(); i++) {
			sb = sb + "point:" + cards.get(i).getPoint() + "color:"
					+ cards.get(i).getColor() + "\r\n";
		}

		System.out.println("the flop is" + sb + "end");
	}

	public void turnMsgTest() {
		String sb = "";

		ArrayList<Card> cards = Competition.getInstance().getTurnCards();

		for (int i = 0; i < cards.size(); i++) {
			sb = sb + "point:" + cards.get(i).getPoint() + "color:"
					+ cards.get(i).getColor() + "\r\n";
		}

		System.out.println("the turn is" + sb + "end");
	}

	public void riverMsgTest() {
		String sb = "";

		ArrayList<Card> cards = Competition.getInstance().getTurnCards();

		for (int i = 0; i < cards.size(); i++) {
			sb = sb + "point:" + cards.get(i).getPoint() + "color:"
					+ cards.get(i).getColor() + "\r\n";
		}

		System.out.println("the river is" + sb + "end");
	}

	public void personCompetitionTest() {
		String sb = "";

		try {
			for (int i = 0; i < testId.size(); i++) {

				Person person = Game.personHashMap.get(testId.get(i));

				sb = sb + "序号: " + String.valueOf(person.getPid()) + "\r\n"
						+ "筹码: " + String.valueOf(person.getJetton()) + "\r\n"
						+ "金币: " + String.valueOf(person.getMoney()) + "\r\n"
						+ "赌注: " + String.valueOf(person.getBet()) + "\r\n"
						+ "动作: "
						+ ActionState.setActionState(person.getAction())
						+ "\r\n" + "排名: " + String.valueOf(person.getRank())
						+ "\r\n" + "手牌类型: "
						+ NutHandState.setNutHandState(person.getNutHand())
						+ "\r\n" + "winPot: "
						+ String.valueOf(person.getWinPot()) + "\r\n";
				// if (testId.get(i).equals(Game.my_id)) {
				sb = sb
						+ "Hold1 color: "
						+ CardState.getColorContext(person.getHold().get(0)
								.getColor())
						+ "\r\n"
						+ "Hold1 point: "
						+ String.valueOf(person.getHold().get(0).getPoint())
						+ "\r\n"
						+ "Hold2 color: "
						+ CardState.getColorContext(person.getHold().get(1)
								.getColor()) + "\r\n" + "Hold2 point: "
						+ String.valueOf(person.getHold().get(1).getPoint())
						+ "\r\n" + "WinProbility: "
						+ String.valueOf(person.getWinProbility()) + "\r\n";
				// }
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("the msgTest 110" + e.toString());
		}

		try {
			sb = sb + "BigBlind: " + Competition.getInstance().getBigBlind()
					+ "\r\n" + "Button: "
					+ Competition.getInstance().getButton() + "\r\n"
					+ "Handcount: " + Competition.getInstance().getHandcount()
					+ "\r\n" + "Pot: " + Competition.getInstance().getPot()
					+ "\r\n" + "SmallBlind: "
					+ Competition.getInstance().getSmallBlind() + "\r\n"
					+ "PersonCount: "
					+ Competition.getInstance().getPersonCount() + "\r\n";

			// flop card
			sb = sb
					+ "flopCard1 color: "
					+ CardState.getColorContext(Competition.getInstance()
							.getFlopCards().get(0).getColor())
					+ "\r\n"
					+ "flopCard1 point: "
					+ String.valueOf(Competition.getInstance().getFlopCards()
							.get(0).getPoint())
					+ "\r\n"
					+ "flopCard2 color: "
					+ CardState.getColorContext(Competition.getInstance()
							.getFlopCards().get(1).getColor())
					+ "\r\n"
					+ "flopCard2 point: "
					+ String.valueOf(Competition.getInstance().getFlopCards()
							.get(1).getPoint())
					+ "\r\n"
					+ "flopCard3 color: "
					+ CardState.getColorContext(Competition.getInstance()
							.getFlopCards().get(2).getColor())
					+ "\r\n"
					+ "flopCard3 point: "
					+ String.valueOf(Competition.getInstance().getFlopCards()
							.get(2).getPoint()) + "\r\n";

			// turn card
			sb = sb
					+ "turnCard1 color: "
					+ CardState.getColorContext(Competition.getInstance()
							.getTurnCards().get(0).getColor())
					+ "\r\n"
					+ "turnCard1 point: "
					+ String.valueOf(Competition.getInstance().getTurnCards()
							.get(0).getPoint()) + "\r\n";

			// river card
			sb = sb
					+ "riverCard1 color: "
					+ CardState.getColorContext(Competition.getInstance()
							.getRiverCards().get(0).getColor())
					+ "\r\n"
					+ "riverCard1 point: "
					+ String.valueOf(Competition.getInstance().getRiverCards()
							.get(0).getPoint()) + "\r\n";

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("the msgTest 127" + e.toString());
		}

		System.out.println("the Msg is" + "\r\n" + sb + "end");
	}
}
