package test;

import java.util.ArrayList;

public class RiverMsg implements MsgFactory {

	@Override
	public void getMsg(String msg) {
		// TODO Auto-generated method stub
		analysisMsg(msg);
	}

	private void analysisMsg(String msg) {
		// TODO Auto-generated method stub

		String[] msgSection = msg.split("\n");

		ArrayList<String[]> stringList = MsgTool.cutMsg(msgSection, 6);

		ArrayList<Card> cardList = new ArrayList<Card>();
		try {

			for (int i = 0; i < stringList.size(); i++) {
				Card card = new Card();
				card.setColor(stringList.get(i)[0]);
				card.setPoint(stringList.get(i)[1]);
				cardList.add(card);
			}

			Competition.getInstance().setRiverCards(cardList);

			// MsgTest test = new MsgTest();
			// test.riverMsgTest();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}
}
