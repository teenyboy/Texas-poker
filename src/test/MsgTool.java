package test;

import java.util.ArrayList;

public class MsgTool {

	public static ArrayList<String[]> cutMsg(String[] msgSection, int msgNum) {

		ArrayList<String[]> stringList = new ArrayList<String[]>();
		switch (msgNum) {
		case 1:
			stringList.clear();
			int msgSectionCount = msgSection.length;
			try {
				if (msgSectionCount <= 3) {
					for (int i = 0; i < msgSectionCount; i++) {
						int msgColon = msgSection[i].indexOf(":");
						String msgSon = msgSection[i].substring(msgColon + 2,
								msgSection[i].length() - 1);
						String[] msgSonSection = msgSon.split(" ");
						stringList.add(msgSonSection);
					}
				} else {
					for (int i = 0; i < 3; i++) {
						int msgColon = msgSection[i].indexOf(":");
						String msgSon = msgSection[i].substring(msgColon + 2,
								msgSection[i].length() - 1);
						String[] msgSonSection = msgSon.split(" ");
						stringList.add(msgSonSection);
					}

					for (int i = 3; i < msgSectionCount; i++) {
						String msgSon = msgSection[i].substring(0,
								msgSection[i].length() - 1);
						String[] msgSonSection = msgSon.split(" ");
						stringList.add(msgSonSection);
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(Competition.getInstance().getHandcount()
						+ "msgtool 42 " + e.toString());
			}

			break;

		case 2:
			stringList.clear();
			try {
				for (int i = 0; i < msgSection.length; i++) {
					String[] msgSon = { "", "" };
					msgSon[0] = msgSection[i].substring(0,
							msgSection[i].indexOf(":"));
					msgSon[1] = msgSection[i].substring(
							msgSection[i].indexOf(":") + 2,
							msgSection[i].length() - 1);

					stringList.add(msgSon);
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(Competition.getInstance().getHandcount()
						+ "msgtool 63 " + e.toString());
			}
			break;

		case 3:
			stringList.clear();
			try {
				String[] holdMsgSon = msgSection[0].split(" ");
				stringList.add(holdMsgSon);
				String[] holdMsgSon1 = msgSection[1].split(" ");
				stringList.add(holdMsgSon1);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(Competition.getInstance().getHandcount()
						+ "msgtool 77 " + e.toString());
			}
			break;
		case 4:
			stringList.clear();
			try {
				for (int i = 0; i < msgSection.length - 1; i++) {
					// System.out.println(msgSection[i]);
					String[] InquireMsgSon = msgSection[i].split(" ");
					stringList.add(InquireMsgSon);
				}
				String totalString = msgSection[msgSection.length - 1];
				String[] totalPot = { "" };
				totalPot[0] = totalString.substring(
						totalString.indexOf(":") + 2, totalString.length() - 1);
				stringList.add(totalPot);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(Competition.getInstance().getHandcount()
						+ "msgtool 97 " + e.toString());
			}
			break;
		case 5:
			stringList.clear();
			try {
				String[] flopMsgSon = msgSection[0].split(" ");
				stringList.add(flopMsgSon);
				String[] flopMsgSon1 = msgSection[1].split(" ");
				stringList.add(flopMsgSon1);
				String[] flopMsgSon2 = msgSection[2].split(" ");
				stringList.add(flopMsgSon2);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(Competition.getInstance().getHandcount()
						+ "msgtool 111 " + e.toString());
			}
			break;
		case 6:
			stringList.clear();
			try {
				String[] turnMsgSon = msgSection[0].split(" ");
				stringList.add(turnMsgSon);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(Competition.getInstance().getHandcount()
						+ "msgtool 122 " + e.toString());
			}
			break;
		case 7:
			stringList.clear();
			try {
				for (int i = 0; i < msgSection.length; i++) {
					String[] msgSon = { "", "", "", "", "", "", "" };
					msgSon[0] = msgSection[i].substring(0,
							msgSection[i].indexOf(":"));
					String msgString = msgSection[i].substring(msgSection[i]
							.indexOf(":") + 2);
					String[] msgStringSplit = msgString.split(" ");
					for (int j = 0; j < msgStringSplit.length; j++) {
						msgSon[j + 1] = msgStringSplit[j];
					}
					stringList.add(msgSon);
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(Competition.getInstance().getHandcount()
						+ "msgtool 141 " + e.toString());
			}
			break;
		case 8:
			stringList.clear();
			try {
				for (int i = 0; i < msgSection.length; i++) {

					String[] msgSon = { "", "" };
					msgSon[0] = msgSection[i].substring(0,
							msgSection[i].indexOf(":"));
					msgSon[1] = msgSection[i].substring(
							msgSection[i].indexOf(":") + 2,
							msgSection[i].length() - 1);

					stringList.add(msgSon);
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(Competition.getInstance().getHandcount()
						+ "msgtool 162 " + e.toString());
			}
			break;
		case 9:
			stringList.clear();
			try {
				for (int i = 0; i < msgSection.length - 1; i++) {
					// System.out.println(msgSection[i]);
					String[] InquireMsgSon = msgSection[i].split(" ");
					stringList.add(InquireMsgSon);
				}
				String totalString = msgSection[msgSection.length - 1];
				String[] totalPot = { "" };
				totalPot[0] = totalString.substring(
						totalString.indexOf(":") + 2, totalString.length() - 1);
				stringList.add(totalPot);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(Competition.getInstance().getHandcount()
						+ "msgtool 173" + e.toString());
			}
			break;
		default:
			break;
		}
		return stringList;
	}
}
