package test;

import java.util.ArrayList;

public class TwoCore {

	Person player = Game.personHashMap.get(Game.my_id);
	int mulitpleMoney = Competition.getInstance().multilpeMoney;
	int mulitple = Competition.getInstance().getMultilpe();
	int bigMulitple = Competition.getInstance().bigMoney;

	public TwoCore() {
		// TODO Auto-generated constructor stub
	}

	public int getTwoCore() {

		int action = 5;

		int maxBet = 0;
		int bet = 0;

		int cardAbility = getCardAbility();
		int allPot = Competition.getInstance().getPot();
		int station = Game.player.getStation();

		ArrayList<Integer> actions = new ArrayList<Integer>();

		try {

			for (int i = 0; i < Game.personHashMap.size(); i++) {
				if (Game.my_id != Game.personHashMap.get(
						Game.personStationHashMap.get(i)).getPid()) {
					bet = Game.personHashMap.get(
							Game.personStationHashMap.get(i)).getBet();

					// 目前最大下注，即跟注需要的赌注
					if (bet > maxBet) {
						maxBet = bet;
					}
					actions.add(Game.personHashMap.get(
							Game.personStationHashMap.get(i)).getAction());

				}
			}

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					" the cardAbility " + cardAbility);
//
//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					" the mulitpleMoney " + mulitpleMoney);
//
//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					" the mulitple " + mulitple);
//
//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					" the station " + station);
//
//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					" the allPot " + allPot);
//
//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					" the maxBet " + maxBet);
//
//			for (int i = 0; i < actions.size(); i++) {
//				WritetoFile.getInstance(Game.my_id).writeMsg(
//						" the actions " + String.valueOf(actions.get(i))
//								+ "\r\n");
//			}

			if (!actions.contains(0) && !actions.contains(1)
					&& !actions.contains(2) && !actions.contains(3)
					&& !actions.contains(4)) {
				action = 1;
				// 全部弃牌
			} else {

				if (station == 0) {
					action = getWeapon(station, actions, cardAbility, allPot,
							maxBet);
				} else if (station == 1) {
					action = getWeapon(station, actions, cardAbility, allPot,
							maxBet);
				} else if (station == 2) {
					action = getWeapon(station, actions, cardAbility, allPot,
							maxBet);
				} else {
					action = getWeapon(station, actions, cardAbility, allPot,
							maxBet);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return action;
	}

	public int getCardAbility() {

		Card card1 = player.getHold().get(0);
		Card card2 = player.getHold().get(1);

		int card1Point = card1.getPoint();
		int card2Point = card2.getPoint();

		int card1Color = card1.getColor();
		int card2Color = card2.getColor();

		int cardAbility = 3;

		if ((card1Point == 14 && card2Point == 14)
				|| (card1Point == 13 && card2Point == 13)
				|| (card1Point == 12 && card2Point == 12)
				|| (((card1Point == 14 && card2Point == 13) || (card1Point == 13 && card2Point == 14)) && card1Color == card2Color)
				|| (((card1Point == 14 && card2Point == 12) || (card1Point == 12 && card2Point == 14)) && card1Color == card2Color)) {
			player.setCardAbility(0);
			cardAbility = 0;
			return cardAbility;
		} else if ((card1Point == card2Point && card2Point > 8)
				|| (((card1Point == 14 && card2Point == 11) || (card1Point == 11 && card2Point == 14)) && card1Color == card2Color)
				|| (((card1Point == 13 && card2Point == 12) || (card1Point == 12 && card2Point == 13)) && card1Color == card2Color)
				|| ((card1Point == 14 && card2Point == 13) || (card1Point == 13 && card2Point == 14))
				|| ((card1Point == 14 && card2Point == 12) || (card1Point == 12 && card2Point == 14))
				|| ((card1Point == 13 && card2Point == 12) || (card1Point == 12 && card2Point == 13))) {
			player.setCardAbility(1);
			cardAbility = 1;
			return cardAbility;
		} else if ((card1Point == card2Point && card2Point <= 8)
				|| (((card1Point == 14 && card2Point == 10) || (card1Point == 10 && card2Point == 14)) && card1Color == card2Color)
				|| (((card1Point == 13 && card2Point == 11) || (card1Point == 11 && card2Point == 13)) && card1Color == card2Color)
				|| (((card1Point == 10 && card2Point == 13) || (card1Point == 13 && card2Point == 10)) && card1Color == card2Color)
				|| (((card1Point == 12 && card2Point == 11) || (card1Point == 11 && card2Point == 12)) && card1Color == card2Color)
				|| (((card1Point == 12 && card2Point == 10) || (card1Point == 10 && card2Point == 12)) && card1Color == card2Color)
				|| (((card1Point == 11 && card2Point == 10) || (card1Point == 10 && card2Point == 11)) && card1Color == card2Color)
				|| ((card1Point == 14 && card2Point == 11) || (card1Point == 11 && card2Point == 14))
				|| ((card1Point == 14 && card2Point == 10) || (card1Point == 10 && card2Point == 14))
				|| ((card1Point == 13 && card2Point == 11) || (card1Point == 11 && card2Point == 13))
				|| ((card1Point == 13 && card2Point == 10) || (card1Point == 10 && card2Point == 13))
				|| ((card1Point == 12 && card2Point == 10) || (card1Point == 10 && card2Point == 12))
				|| ((card1Point == 12 && card2Point == 11) || (card1Point == 11 && card2Point == 12))
				|| ((card1Point == 11 && card2Point == 10) || (card1Point == 10 && card2Point == 11))) {
			player.setCardAbility(2);
			cardAbility = 2;
			return cardAbility;
		} else if (card1Color == card2Color
				&& (card1Point > 10 || card2Point > 10)) {
			player.setCardAbility(6);
			cardAbility = 6;
			return cardAbility;
		} else if (card1Color == card2Color
				&& (card1Point <= 10 && card2Point <= 10)) {
			player.setCardAbility(7);
			cardAbility = 7;
			return cardAbility;
		} else {
			player.setCardAbility(3);
			cardAbility = 3;
		}

		return cardAbility;
	}

	private int getWeapon(int station, ArrayList<Integer> actions,
			int cardAbility, int allPot, int maxBet) {

		int action = 5;

		switch (station) {
		case 0:

//			WritetoFile.getInstance(Game.my_id).writeMsg(" getWeapon 0 ");

			if (actions.contains(3) || actions.contains(4)) {
				action = getInputStargy(cardAbility, allPot, maxBet, station);
			} else {
				action = getWaitStagy(cardAbility, station);
			}

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"the getWeapon is " + String.valueOf(action));

			break;

		case 1:

//			WritetoFile.getInstance(Game.my_id).writeMsg(" getWeapon 1 ");

			if (actions.contains(3) || actions.contains(4)) {
				action = getInputStargy(cardAbility, allPot, maxBet, station);
			} else {
				action = getWaitStagy(cardAbility, station);
			}

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"the getWeapon is " + String.valueOf(action));

			break;

		case 2:

//			WritetoFile.getInstance(Game.my_id).writeMsg(" getWeapon 2 ");

			if (actions.contains(3) || actions.contains(4)) {
				action = getInputStargy(cardAbility, allPot, maxBet, station);
			} else {
				action = getWaitStagy(cardAbility, station);
			}

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"the getWeapon is " + String.valueOf(action));

			break;

		default:

//			WritetoFile.getInstance(Game.my_id).writeMsg(" getWeapon other ");

			if (actions.contains(3) || actions.contains(4)) {
				action = getInputStargy(cardAbility, allPot, maxBet, station);
			} else {
				action = getWaitStagy(cardAbility, station);
			}

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"the getWeapon is " + String.valueOf(action));

			break;
		}
		return action;
	}

	private int getInputStargy(int cardAbility, int allPot, int maxBet,
			int station) {

		int action = 5;

		switch (cardAbility) {
		case 0:

			if (mulitple < 1) {
				mulitple = 1;
			}

			if (allPot <= mulitpleMoney * mulitple
					&& maxBet <= bigMulitple * mulitple) {
				action = 2;
			} else {
				action = 5;
			}
			break;
		case 1:

			if (mulitple < 2) {
				mulitple = 2;
			}

			if (allPot <= mulitpleMoney * (mulitple - 1)
					&& maxBet <= bigMulitple * (mulitple - 1)) {
				action = 2;
			} else {
				action = 5;
			}
			break;

		case 2:

			if (mulitple < 3) {
				mulitple = 3;
			}

			if (allPot <= mulitpleMoney * (mulitple - 2)
					&& maxBet <= bigMulitple * (mulitple - 2)) {
				action = 2;
			} else {
				action = 5;
			}
			break;

		case 6:
			if (station > 2) {
				action = 5;
			} else {

				if (mulitple < 4) {
					mulitple = 4;
				}

				if (allPot <= mulitpleMoney * (mulitple - 3)
						&& maxBet <= bigMulitple * (mulitple - 3)) {
					action = 2;
				} else {
					action = 5;
				}
			}
			break;

		case 7:
			action = 5;
			break;

		case 3:
			action = 5;
			break;

		default:
			break;
		}
		return action;
	}

	private int getWaitStagy(int cardAbility, int station) {

		int action = 5;

		switch (cardAbility) {
		case 0:
			if (station == 2 || station == 1 || station == 0) {
				action = 3;
				PlayerCore.getInstance().setRaise(bigMulitple * 5);
			} else {
				action = 2;
			}
			break;
		case 1:
			if (station == 2 || station == 1 || station == 0) {
				action = 3;
				PlayerCore.getInstance().setRaise(bigMulitple * 5);
			} else {
				action = 2;
			}
			break;

		case 2:
			if (station == 2 || station == 1 || station == 0) {
				action = 3;
				PlayerCore.getInstance().setRaise(bigMulitple * 5);
			} else {
				action = 2;
			}
			break;

		case 6:
			if (station == 2 || station == 1) {
				action = 3;
				PlayerCore.getInstance().setRaise(bigMulitple * 5);
			} else {
				action = 5;
			}
			break;

		case 7:
			if (station == 2 || station == 1) {
				action = 3;
				PlayerCore.getInstance().setRaise(bigMulitple * 5);
			} else {
				action = 5;
			}
			break;

		case 3:
			if (station == 2) {
				action = 2;
			} else {
				action = 5;
			}
			break;

		default:
			break;
		}
		return action;
	}
}
