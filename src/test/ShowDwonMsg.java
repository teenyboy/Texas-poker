package test;

import java.util.ArrayList;

public class ShowDwonMsg implements MsgFactory {

	@Override
	public void getMsg(String msg) {
		// TODO Auto-generated method stub
		analysisMsg(msg);
	}

	private void analysisMsg(String msg) {
		// TODO Auto-generated method stub

//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				"showDownMsg is " + msg + "\r\n");

		String[] msgSection = msg.split("\n");

		ArrayList<String[]> stringList = MsgTool.cutMsg(msgSection, 7);

		try {

			for (int i = 0; i < stringList.size(); i++) {

				Person person = Game.personHashMap.get(Integer
						.valueOf(stringList.get(i)[1]));
				person.setRank(Integer.valueOf(stringList.get(i)[0]));

				ArrayList<Card> cardList = new ArrayList<Card>();

				Card card = new Card();
				card.setColor(stringList.get(i)[2]);
				card.setPoint(stringList.get(i)[3]);
				cardList.add(card);

				Card card2 = new Card();
				card2.setColor(stringList.get(i)[4]);
				card2.setPoint(stringList.get(i)[5]);
				cardList.add(card2);

				person.setHold(cardList);
				person.setNutHand(stringList.get(i)[6]);
			}

			// MsgTest test = new MsgTest();
			// test.personCompetitionTest();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}
}
