package test;

import java.util.ArrayList;

public class SeatMsg implements MsgFactory {

	@Override
	public void getMsg(String msg) {
		// TODO Auto-generated method stub
		analysisMsg(msg);
	}

	private void analysisMsg(String msg) {
		// TODO Auto-generated method stub

		String[] msgSection = msg.split("\n");

		ArrayList<String[]> stringList = MsgTool.cutMsg(msgSection, 1);

		Competition.getInstance().setPersonCount(msgSection.length);

		try {
			// 赋值person
			for (int i = 0; i < stringList.size(); i++) {
				String[] msgTest = stringList.get(i);
				if (msgTest[0].equals(String.valueOf(Game.my_id))) {
					Game.player.setJetton(Integer.valueOf(msgTest[1]));
					Game.player.setMoney(Integer.valueOf(msgTest[2]));
					Game.player.setStation(i);
					Game.personHashMap.put(Integer.valueOf(msgTest[0]),
							Game.player);
				} else {
					Person person = new Person();
					person.setPid(Integer.valueOf(msgTest[0]));
					person.setJetton(Integer.valueOf(msgTest[1]));
					person.setMoney(Integer.valueOf(msgTest[2]));
					person.setStation(i);
					Game.personHashMap.put(Integer.valueOf(msgTest[0]), person);
				}

				// 座位信息与id绑定
				Game.personStationHashMap.put(i, Integer.valueOf(msgTest[0]));
				// 获得座位信息
				PersonIdentity.getPerson();
			}

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"player station is " + Game.player.getStation());

			// 设置超过6000元权值下降
			if (Game.player.getJetton() > Competition.getInstance().maxMoney) {
				Competition.getInstance().setMultilpe(4);
				Competition.getInstance().setMaxDropMultilpe(8);
			} else {
				Competition.getInstance().setMultilpe(5);
				Competition.getInstance().setMaxDropMultilpe(10);
			}
			// 设置人数
			Competition.getInstance().setAllPersonCount(stringList.size());

			// test函数
			// MsgTest test = new MsgTest();
			// test.seatMsgTest();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}
}
