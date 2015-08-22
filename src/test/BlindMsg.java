package test;

import java.util.ArrayList;

public class BlindMsg implements MsgFactory {

	@Override
	public void getMsg(String msg) {
		// TODO Auto-generated method stub
		analysisMsg(msg);
	}

	private void analysisMsg(String msg) {
		// TODO Auto-generated method stub

		String[] msgSection = msg.split("\n");

		ArrayList<String[]> stringList = MsgTool.cutMsg(msgSection, 2);

		Competition competition = Competition.getInstance();

		try {
			// 赋值person,Competition
			String[] smallBlind = stringList.get(0);
			competition.setSmallBlind(Integer.valueOf(smallBlind[0]));
			Game.personHashMap.get(Integer.valueOf(smallBlind[0]))
					.setIsSmallBlind(true);
			Game.personHashMap.get(Integer.valueOf(smallBlind[0])).setBet(
					Integer.valueOf(smallBlind[1]));

			if (msgSection.length != 1) {
				String[] bigBlind = stringList.get(1);
				competition.setBigBlind(Integer.valueOf(bigBlind[0]));
				Game.personHashMap.get(Integer.valueOf(bigBlind[0]))
						.setIsBigBlind(true);
				Game.personHashMap.get(Integer.valueOf(bigBlind[0])).setBet(
						Integer.valueOf(bigBlind[1]));
			}

			if (!Competition.getInstance().bigblind) {
				Competition.getInstance().multilpeMoney = Game.personHashMap
						.get(Competition.getInstance().getBigBlind()).getBet()
						* (Competition.getInstance().getAllPersonCount() - 1)
						- Game.personHashMap.get(
								Competition.getInstance().getSmallBlind())
								.getBet();

				Competition.getInstance().bigMoney = Game.personHashMap.get(
						Competition.getInstance().getBigBlind()).getBet();

				Competition.getInstance().bigblind = true;
			}

//			 WritetoFile.getInstance(Game.my_id).writeMsg(
//			 " AllPersonCount "
//			 + Competition.getInstance().getAllPersonCount());
//			
//			 WritetoFile.getInstance(Game.my_id).writeMsg(
//			 " bigBlind "
//			 + Game.personHashMap.get(
//			 Competition.getInstance().getBigBlind())
//			 .getBet());
//			
//			 WritetoFile.getInstance(Game.my_id).writeMsg(
//			 " smallBlind "
//			 + Game.personHashMap.get(
//			 Competition.getInstance().getSmallBlind())
//			 .getBet());
//			
//			 WritetoFile.getInstance(Game.my_id).writeMsg(
//			 " mulityple " + Competition.getInstance().multilpeMoney);

			// test函数
			// MsgTest test = new MsgTest();
			// test.blindMsgTest();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}
}
