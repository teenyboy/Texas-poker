package test;

import java.io.IOException;

public class Core {

	public Core() {
		// TODO Auto-generated constructor stub
	}

	public void algorithmCore() throws IOException {

		int action = 1;

		if (Competition.getInstance().getFlopCards().size() == 0
				&& Game.player.getHold().size() == 2) {
			TwoCore twoCore = new TwoCore();
			action = twoCore.getTwoCore();

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"\r\n" + " 2--action is " + action + "\r\n");
		}

		if (Competition.getInstance().getFlopCards().size() == 3
				&& Competition.getInstance().getTurnCards().size() == 0
				&& Competition.getInstance().getRiverCards().size() == 0) {
			FiveCore fiveCore = new FiveCore();
			action = fiveCore.getFiveCore();

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"\r\n" + " 5--action is " + action + "\r\n");
		}

		if (Competition.getInstance().getFlopCards().size() == 3
				&& Competition.getInstance().getTurnCards().size() == 1
				&& Competition.getInstance().getRiverCards().size() == 0) {
			SixCore sixCore = new SixCore();
			action = sixCore.getSixCore();

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"\r\n" + " 6--action is " + action + "\r\n");
		}

		if (Competition.getInstance().getFlopCards().size() == 3
				&& Competition.getInstance().getTurnCards().size() == 1
				&& Competition.getInstance().getRiverCards().size() == 1) {
			SevenCore sevenCore = new SevenCore();
			action = sevenCore.getSevenCore();

			// WritetoFile.getInstance(Game.my_id).writeMsg(
			//		"\r\n" + " 7--action is " + action + "\r\n");
		}

		setActionNum(action);

		Competition.allAverTime = Competition.allAverTime
				+ (System.currentTimeMillis() - Competition.getInstance()
						.getAverTime());

	}

	private void setActionNum(int actionNum) {
		if (actionNum <= 5 && actionNum >= 0) {
			String action = ActionState.setActionState(actionNum);

			if (actionNum == 3) {

				action = action
						+ String.valueOf(PlayerCore.getInstance().getRaise());
			}
			sendMsg(action);
		}
	}

	private void sendMsg(String actionString) {
		MsgUtil msgUtil = new MsgUtil();

		try {
			byte[] actionMsg = msgUtil.toSocket(actionString);
			Game.outData.write(actionMsg);
			Game.outData.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
