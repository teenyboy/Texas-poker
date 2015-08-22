package test;

import java.util.ArrayList;

public class PotWinMsg implements MsgFactory {

	@Override
	public void getMsg(String msg) {
		// TODO Auto-generated method stub
		analysisMsg(msg);
	}

	private void analysisMsg(String msg) {
		// TODO Auto-generated method stub

		if (msg.contains(":")) {
			String[] msgSection = msg.split("\n");

			ArrayList<String[]> stringList = MsgTool.cutMsg(msgSection, 8);

			try {

				for (int i = 0; i < stringList.size(); i++) {
					Person person = Game.personHashMap.get(Integer
							.valueOf(stringList.get(i)[0]));
					person.setWinPot(Integer.valueOf(stringList.get(i)[1]));
					person.setWinCount();
				}

//				 WritetoFile.getInstance(Game.my_id).writeMsg(
//				 "---------------------------the handcount is"
//				 + String.valueOf(Competition.getInstance()
//										.getHandcount()) + "\r\n");

				Game.winCardHashMap
						.put(Game.player.getCardAbility(), Game.winCardHashMap
								.get(Game.player.getCardAbility()) + 1);

				Competition.getInstance().clearCompetitionMsg();
				PlayerCore playerCore = PlayerCore.getInstance();
				playerCore.setRaise(0);

				for (int i = 0; i < Game.personHashMap.size(); i++) {
					Person person = Game.personHashMap
							.get(Game.personStationHashMap.get(i));
					person.clearPersonMsg();
				}

				// MsgTest test = new MsgTest();
				// test.personCompetitionTest();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.toString());
			}
		}
	}
}
