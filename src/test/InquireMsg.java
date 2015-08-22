package test;

import java.util.ArrayList;

public class InquireMsg implements MsgFactory {

	@Override
	public void getMsg(String msg) {
		// TODO Auto-generated method stub
		analysisMsg(msg);

		Competition.getInstance().setAverTime(System.currentTimeMillis());
	}

	private void analysisMsg(String msg) {
		// TODO Auto-generated method stub

		String[] msgSection = msg.split("\n");

		ArrayList<String[]> stringList = MsgTool.cutMsg(msgSection, 4);

		int personCount = 0;

		try {
			for (int i = 0; i < stringList.size() - 1; i++) {

				Person person = Game.personHashMap.get(Integer
						.valueOf(stringList.get(i)[0]));
				person.setJetton(Integer.valueOf(stringList.get(i)[1]));
				person.setMoney(Integer.valueOf(stringList.get(i)[2]));
				person.setBet(Integer.valueOf(stringList.get(i)[3])
						- person.getBet());// 净加注
				person.setAction(stringList.get(i)[4]);

				if (person.getAction() != 5) {
					personCount++;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("InquireMsg 34 " + e.toString());
		}

		try {

			Competition.getInstance().setPersonCount(personCount);
			Competition.getInstance().setPot(
					Integer.valueOf(stringList.get(stringList.size() - 1)[0]));



			// MsgTest test = new MsgTest();
			// test.personCompetitionTest();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("InquireMsg 53 " + e.toString());
		}

	}
}
