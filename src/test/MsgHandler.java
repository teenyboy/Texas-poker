package test;

import java.io.IOException;

public class MsgHandler implements MsgInterface {

	private static Object object = new Object();
	private static MsgHandler msgHandler = null;
	private int SEAT = 0;
	private int BLIND = 1;
	private int HOLD = 2;
	private int INQUIRE = 3;
	private int FLOP = 4;
	private int TURN = 5;
	private int RIVER = 6;
	private int SHOWDOWN = 7;
	private int POTWIN = 8;
	private int NOTIFY = 9;

	private MsgHandler() {
		// TODO Auto-generated constructor stub
	}

	// 消息解析
	public static MsgHandler getInstance() {
		if (msgHandler == null) {
			synchronized (object) {
				if (msgHandler == null)
					msgHandler = new MsgHandler();
			}
		}
		return msgHandler;
	}

	public void setMsg(String msg) {
		dealMsg(msg);
	}

	private void dealMsg(String msg) {
		int msgStyle = 0;
		int first = msg.indexOf("/");
		if (first != -1) {
			if (msg.subSequence(0, first).equals("seat")) {
				msgStyle = SEAT;
				getMsgWeapon(msgStyle, msg);
			} else if (msg.subSequence(0, first).equals("blind")) {
				msgStyle = BLIND;
				getMsgWeapon(msgStyle, msg);
			} else if (msg.subSequence(0, first).equals("hold")) {
				msgStyle = HOLD;
				getMsgWeapon(msgStyle, msg);
			} else if (msg.subSequence(0, first).equals("inquire")) {
				msgStyle = INQUIRE;
				getMsgWeapon(msgStyle, msg);
			} else if (msg.subSequence(0, first).equals("flop")) {
				msgStyle = FLOP;
				getMsgWeapon(msgStyle, msg);
			} else if (msg.subSequence(0, first).equals("turn")) {
				msgStyle = TURN;
				getMsgWeapon(msgStyle, msg);
			} else if (msg.subSequence(0, first).equals("river")) {
				msgStyle = RIVER;
				getMsgWeapon(msgStyle, msg);
			} else if (msg.subSequence(0, first).equals("showdown")) {
				msgStyle = SHOWDOWN;
				getMsgWeapon(msgStyle, msg);
			} else if (msg.subSequence(0, first).equals("pot-win")) {
				msgStyle = POTWIN;
				getMsgWeapon(msgStyle, msg);
			} else if (msg.subSequence(0, first).equals("notify")) {
				msgStyle = NOTIFY;
				getMsgWeapon(msgStyle, msg);
			} else {
				int firstError = msg.indexOf("/n", first + 2);
				msg = msg.substring(firstError + 1);
				dealMsg(msg);
			}
		}
	}

	private void getMsgWeapon(int msgStyle, String msg) {
		int first = msg.indexOf("/");
		int end = 0;
		String msgSection = "";
		switch (msgStyle) {
		case 0:
			end = msg.indexOf("/", first + 1);
			String seatMsg = msg.substring(first + 3, end);
			getSeatMsg(seatMsg);// 写入seatMsg信息
			break;
		case 1:
			end = msg.indexOf("/", first + 1);
			String blindMsg = msg.substring(first + 3, end);
			getBlindMsg(blindMsg);// 写入blindMsg信息
			break;
		case 2:
			end = msg.indexOf("/", first + 1);
			String holdMsg = msg.substring(first + 3, end);
			getHoldCardsMsg(holdMsg);// 写入holdMsg信息
			break;
		case 3:
			end = msg.indexOf("/", first + 1);
			String inquireMsg = msg.substring(first + 3, end);
			getInquireMsg(inquireMsg);// 写入inquireMsg信息
			break;
		case 4:
			end = msg.indexOf("/", first + 1);
			String flopMsg = msg.substring(first + 3, end);
			getFlopMsg(flopMsg);// 写入flopMsg信息
			break;
		case 5:
			end = msg.indexOf("/", first + 1);
			String turnMsg = msg.substring(first + 3, end);
			getTurnMsg(turnMsg);// 写入turnMsg信息
			break;
		case 6:
			end = msg.indexOf("/", first + 1);
			String riverMsg = msg.substring(first + 3, end);
			getRiverMsg(riverMsg);// 写入riverMsg信息
			break;
		case 7:
			int commonFirst = msg.indexOf("/", first + 2);
			int commonEnd = msg.indexOf("/", commonFirst + 2);
			end = msg.indexOf("/", commonEnd + 2);
			String showDownMsg = msg.substring(commonEnd + 9, end);
			getShowDownMsg(showDownMsg);// 写入showDownMsg信息
			break;
		case 8:
			end = msg.indexOf("/", first + 1);
			String potWinMsg = msg.substring(first + 3, end);
			getPotWinMsg(potWinMsg);// 写入potWinMsg信息
			break;
		case 9:
			end = msg.indexOf("/", first + 1);
			String notifyMsg = msg.substring(first + 3, end);
			getNotifyMsg(notifyMsg);// 写入notifyMsg信息
			break;

		default:
			break;
		}
		int Stop = msg.indexOf("\n", end + 1);
		msgSection = msg.substring(Stop + 1);
		dealMsg(msgSection);
	}

	@Override
	public void getSeatMsg(String msg) {
		// TODO Auto-generated method stub

		SeatMsg seatMsg = new SeatMsg();
		seatMsg.getMsg(msg);
	}

	@Override
	public void getBlindMsg(String msg) {
		// TODO Auto-generated method stub
		BlindMsg blindMsg = new BlindMsg();
		blindMsg.getMsg(msg);
	}

	@Override
	public void getHoldCardsMsg(String msg) {
		// TODO Auto-generated method stub
		HoldMsg holdMsg = new HoldMsg();
		holdMsg.getMsg(msg);
	}

	@Override
	public void getInquireMsg(String msg) {
		// TODO Auto-generated method stub
		InquireMsg inquireMsg = new InquireMsg();
		inquireMsg.getMsg(msg);

		Core msgCore = new Core();
		try {
			msgCore.algorithmCore();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void getFlopMsg(String msg) {
		// TODO Auto-generated method stub
		FlopMsg flopMsg = new FlopMsg();
		flopMsg.getMsg(msg);
	}

	@Override
	public void getTurnMsg(String msg) {
		// TODO Auto-generated method stub
		TurnMsg turnMsg = new TurnMsg();
		turnMsg.getMsg(msg);
	}

	@Override
	public void getRiverMsg(String msg) {
		// TODO Auto-generated method stub
		RiverMsg riverMsg = new RiverMsg();
		riverMsg.getMsg(msg);
	}

	@Override
	public void getShowDownMsg(String msg) {
		// TODO Auto-generated method stub
		ShowDwonMsg showDwonMsg = new ShowDwonMsg();
		showDwonMsg.getMsg(msg);
	}

	@Override
	public void getPotWinMsg(String msg) {
		// TODO Auto-generated method stub
		PotWinMsg potWinMsg = new PotWinMsg();
		potWinMsg.getMsg(msg);

		Competition.getInstance().setHandcount();
	}

	@Override
	public void getNotifyMsg(String msg) {
		// TODO Auto-generated method stub
		NotifyMsg notifyMsg = new NotifyMsg();
		notifyMsg.getMsg(msg);
	}

}
