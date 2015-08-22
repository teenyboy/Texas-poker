package test;

import java.util.ArrayList;
import java.util.Arrays;

public class CardJudge {

	Person player = Game.personHashMap.get(Game.my_id);
	int mulitpleMoney = Competition.getInstance().multilpeMoney;
	int mulitple = Competition.getInstance().getMultilpe();
	int maxDropMulitple = Competition.getInstance().getMaxDropMultilpe();
	int bigMulitple = Competition.getInstance().bigMoney;
	// boolean isEnd = Game.player.isIsEndStation();

	ArrayList<Card> cardList = new ArrayList<Card>();

	public CardJudge() {
		// TODO Auto-generated constructor stub
	}

	public int setCardJudge(ArrayList<Card> cards, int end) {

		// public int setCardJudge() {

		if (end == 1) {
			cardList.clear();

			cardList.add(cards.get(0));
			cardList.add(cards.get(1));
			cardList.add(cards.get(2));
			cardList.add(cards.get(3));
			cardList.add(cards.get(4));
		}

		int[] cardPoint = new int[5];
		int[] cardColor = new int[5];

		int[] cardPointNum = new int[5];

		int cardAbility;

		cardPoint[0] = cards.get(0).getPoint();
		cardPoint[1] = cards.get(1).getPoint();
		cardPoint[2] = cards.get(2).getPoint();
		cardPoint[3] = cards.get(3).getPoint();
		cardPoint[4] = cards.get(4).getPoint();

		cardColor[0] = cards.get(0).getColor();
		cardColor[1] = cards.get(1).getColor();
		cardColor[2] = cards.get(2).getColor();
		cardColor[3] = cards.get(3).getColor();
		cardColor[4] = cards.get(4).getColor();

		Arrays.sort(cardPoint);

		if (cardPoint[4] == 14) {
			cardPointNum[0] = 1;
			cardPointNum[1] = cardPoint[0];
			cardPointNum[2] = cardPoint[1];
			cardPointNum[3] = cardPoint[2];
			cardPointNum[4] = cardPoint[3];
		}

		if ((cardPoint[0] == cardPoint[1] && cardPoint[1] == cardPoint[2] && cardPoint[2] == cardPoint[3])
				|| (cardPoint[1] == cardPoint[2]
						&& cardPoint[2] == cardPoint[3] && cardPoint[3] == cardPoint[4])) {
			// 四张
			Game.player.setCardAbility(4);
			if (cardPoint[0] == cardPoint[1] && cardPoint[1] == cardPoint[2]
					&& cardPoint[2] == cardPoint[3]) {
				if (Game.player.getHold().get(0).getPoint() == cardPoint[4]
						|| Game.player.getHold().get(1).getPoint() == cardPoint[4]) {
					Game.player.setHoldInfluence(1);
				}
			} else {
				if (Game.player.getHold().get(0).getPoint() == cardPoint[0]
						|| Game.player.getHold().get(1).getPoint() == cardPoint[0]) {
					Game.player.setHoldInfluence(1);
				}
			}
			cardAbility = 4;
			return cardAbility;
		}

		if (cardColor[0] == cardColor[1] && cardColor[1] == cardColor[2]
				&& cardColor[2] == cardColor[3] && cardColor[3] == cardColor[4]) {

			if ((cardPoint[0] + 1 == cardPoint[1]
					&& cardPoint[1] + 1 == cardPoint[2]
					&& cardPoint[2] + 1 == cardPoint[3] && cardPoint[3] + 1 == cardPoint[4])
					|| (cardPointNum[0] + 1 == cardPointNum[1]
							&& cardPointNum[1] + 1 == cardPointNum[2]
							&& cardPointNum[2] + 1 == cardPointNum[3] && cardPointNum[3] + 1 == cardPointNum[4])) {

				// 皇家同花顺 皇家顺子
				Game.player.setCardAbility(4);
				cardAbility = 4;
				getHoldInfluence(cardPoint);
				return cardAbility;

			} else {
				// 同花 2张
				Game.player.setCardAbility(0);
				getHoldInfluence(cardPoint);
				cardAbility = 0;

				return cardAbility;
			}
		} else {

			if (cardPoint[0] == cardPoint[1] && cardPoint[1] == 13
					&& cardPoint[2] == cardPoint[3]
					&& cardPoint[3] == cardPoint[4] && cardPoint[4] == 14) {
				// 皇家葫芦
				Game.player.setCardAbility(4);
				cardAbility = 4;
				getHoldInfluence(cardPoint);
				return cardAbility;
			}

			if ((cardPoint[0] == cardPoint[1] && cardPoint[1] == cardPoint[2] && cardPoint[3] == cardPoint[4])
					|| (cardPoint[0] == cardPoint[1]
							&& cardPoint[2] == cardPoint[3] && cardPoint[3] == cardPoint[4])) {
				// 一般葫芦
				Game.player.setCardAbility(5);
				getHoldInfluence(cardPoint);
				cardAbility = 5;
				return cardAbility;
			}

			if ((cardPoint[0] + 1 == cardPoint[1]
					&& cardPoint[1] + 1 == cardPoint[2]
					&& cardPoint[2] + 1 == cardPoint[3] && cardPoint[3] + 1 == cardPoint[4])
					|| (cardPointNum[0] + 1 == cardPointNum[1]
							&& cardPointNum[1] + 1 == cardPointNum[2]
							&& cardPointNum[2] + 1 == cardPointNum[3] && cardPointNum[3] + 1 == cardPointNum[4])) {

				// 顺子 2张
				Game.player.setCardAbility(0);
				getHoldInfluence(cardPoint);
				cardAbility = 0;
				return cardAbility;
			} else if ((cardPoint[0] == cardPoint[1]
					&& cardPoint[2] == cardPoint[3] && (cardPoint[0] > 10 || cardPoint[2] > 10))
					|| (cardPoint[0] == cardPoint[1]
							&& cardPoint[3] == cardPoint[4] && (cardPoint[0] > 10 || cardPoint[3] > 10))
					|| (cardPoint[1] == cardPoint[2]
							&& cardPoint[3] == cardPoint[4] && (cardPoint[1] > 10 || cardPoint[3] > 10))) {
				// 两对
				Game.player.setCardAbility(0);
				cardAbility = 0;

				// // 手牌为0，12相同，为3，45相同，为5，34相同
				if (((Game.player.getHold().get(0).getPoint() == cardPoint[0] || Game.player
						.getHold().get(1).getPoint() == cardPoint[0])
						&& cardPoint[1] == cardPoint[2] && cardPoint[3] == cardPoint[4])
						|| ((Game.player.getHold().get(0).getPoint() == cardPoint[2] || (Game.player
								.getHold().get(1).getPoint() == cardPoint[2]))
								&& cardPoint[0] == cardPoint[1] && cardPoint[3] == cardPoint[4])
						|| ((Game.player.getHold().get(0).getPoint() == cardPoint[4] || Game.player
								.getHold().get(1).getPoint() == cardPoint[4])
								&& cardPoint[0] == cardPoint[1] && cardPoint[3] == cardPoint[2])) {
					Game.player.setHoldInfluence(1);
				} else {
					Game.player.setHoldInfluence(2);
				}

				return cardAbility;
			} else if ((cardPoint[0] == cardPoint[1]
					&& cardPoint[2] == cardPoint[3] && (cardPoint[0] <= 10 && cardPoint[2] <= 10))
					|| (cardPoint[0] == cardPoint[1]
							&& cardPoint[3] == cardPoint[4] && (cardPoint[0] <= 10 || cardPoint[3] <= 10))
					|| (cardPoint[1] == cardPoint[2]
							&& cardPoint[3] == cardPoint[4] && (cardPoint[1] <= 10 || cardPoint[3] <= 10))) {
				// 两对
				Game.player.setCardAbility(1);
				cardAbility = 1;

				// // 手牌为0，12相同，为3，45相同，为5，34相同
				if ((Game.player.getHold().get(0).getPoint() == cardPoint[0] && cardPoint[1] == cardPoint[2])
						|| (Game.player.getHold().get(0).getPoint() == cardPoint[2] && cardPoint[3] == cardPoint[4])
						|| (Game.player.getHold().get(0).getPoint() == cardPoint[4] && cardPoint[3] == cardPoint[2])) {
					Game.player.setHoldInfluence(1);
				} else {
					Game.player.setHoldInfluence(2);
				}
				return cardAbility;
			} else if ((cardPoint[0] == cardPoint[1] && cardPoint[1] == cardPoint[2])
					|| (cardPoint[1] == cardPoint[2] && cardPoint[2] == cardPoint[3])
					|| (cardPoint[2] == cardPoint[3] && cardPoint[3] == cardPoint[4])) {
				// 三张相同
				Game.player.setCardAbility(0);
				cardAbility = 0;

				if (cardPoint[0] == cardPoint[1]
						&& cardPoint[1] == cardPoint[2]) {
					// 012
					if (Game.player.getHold().get(0).getPoint() > cardPoint[0]
							&& Game.player.getHold().get(1).getPoint() > cardPoint[0]) {
						Game.player.setHoldInfluence(0);
					} else if (Game.player.getHold().get(0).getPoint() == cardPoint[0]
							&& Game.player.getHold().get(1).getPoint() == cardPoint[0]) {
						Game.player.setHoldInfluence(2);
					} else {
						Game.player.setHoldInfluence(1);
					}
				} else if (cardPoint[2] == cardPoint[3]
						&& cardPoint[3] == cardPoint[4]) {
					// 234
					if (Game.player.getHold().get(0).getPoint() < cardPoint[2]
							&& Game.player.getHold().get(1).getPoint() < cardPoint[2]) {
						Game.player.setHoldInfluence(0);
					} else if (Game.player.getHold().get(0).getPoint() == cardPoint[2]
							&& Game.player.getHold().get(1).getPoint() == cardPoint[2]) {
						Game.player.setHoldInfluence(2);
					} else {
						Game.player.setHoldInfluence(1);
					}
				} else {
					// (123)
					if ((Game.player.getHold().get(0).getPoint() < cardPoint[1] && Game.player
							.getHold().get(1).getPoint() > cardPoint[3])
							|| (Game.player.getHold().get(0).getPoint() > cardPoint[3] && Game.player
									.getHold().get(1).getPoint() < cardPoint[1])) {
						Game.player.setHoldInfluence(0);
					} else if (Game.player.getHold().get(0).getPoint() == cardPoint[2]
							&& Game.player.getHold().get(1).getPoint() == cardPoint[2]) {
						Game.player.setHoldInfluence(2);
					} else {
						Game.player.setHoldInfluence(1);
					}
				}
				return cardAbility;
			} else if (cardPoint[3] == Game.player.getHold().get(0).getPoint()
					&& cardPoint[4] == Game.player.getHold().get(1).getPoint()
					&& cardPoint[3] == cardPoint[4]) {
				// 手中一对大于公共牌
				Game.player.setCardAbility(1);
				Game.player.setHoldInfluence(2);
				cardAbility = 1;
				return cardAbility;
			} else if (cardPoint[4] == 14
					&& cardPoint[3] == cardPoint[2]
					&& (Game.player.getHold().get(0).getPoint() == 14 || Game.player
							.getHold().get(1).getPoint() == 14)) {
				// 最大为A，且随后为一对
				Game.player.setCardAbility(1);
				cardAbility = 1;

				int num = 2;
				if (Game.player.getHold().get(0).getPoint() < cardPoint[2]) {
					num = num - 1;
				}
				if (Game.player.getHold().get(1).getPoint() < cardPoint[2]) {
					num = num - 1;
				}
				Game.player.setHoldInfluence(num);
				return cardAbility;
			} else if (cardPoint[4] == cardPoint[3]
					&& ((Game.player.getHold().get(0).getPoint() == cardPoint[3]
							&& Game.player.getHold().get(1).getPoint() != cardPoint[3] && Game.player
							.getHold().get(1).getPoint() > 8) || (Game.player
							.getHold().get(1).getPoint() == cardPoint[3]
							&& Game.player.getHold().get(0).getPoint() != cardPoint[3] && Game.player
							.getHold().get(0).getPoint() > 8))) {
				// 一对大牌，但护牌较小

				Game.player.setCardAbility(2);
				cardAbility = 2;
				Game.player.setHoldInfluence(2);
				return cardAbility;
			} else if ((cardPoint[1] == cardPoint[2] || cardPoint[0] == cardPoint[1])
					&& cardPoint[4] == 14
					&& (Game.player.getHold().get(0).getPoint() == 14 || Game.player
							.getHold().get(1).getPoint() == 14)) {
				// 一对中型牌，护牌为A
				Game.player.setCardAbility(2);
				cardAbility = 2;

				int num = 2;
				if (cardPoint[1] == cardPoint[2]) {
					if (Game.player.getHold().get(0).getPoint() == cardPoint[0]
							|| Game.player.getHold().get(0).getPoint() == cardPoint[3]) {
						num = num - 1;
					}
					if (Game.player.getHold().get(1).getPoint() == cardPoint[0]
							|| Game.player.getHold().get(1).getPoint() == cardPoint[3]) {
						num = num - 1;
					}
				} else if (cardPoint[0] == cardPoint[1]) {
					if (Game.player.getHold().get(0).getPoint() == cardPoint[2]
							|| Game.player.getHold().get(0).getPoint() == cardPoint[3]) {
						num = num - 1;
					}
					if (Game.player.getHold().get(1).getPoint() == cardPoint[2]
							|| Game.player.getHold().get(1).getPoint() == cardPoint[3]) {
						num = num - 1;
					}
				}
				Game.player.setHoldInfluence(num);
				return cardAbility;
			} else if ((cardPoint[2] == cardPoint[3]
					&& cardPoint[2] == Game.player.getHold().get(0).getPoint() && cardPoint[3] == Game.player
					.getHold().get(1).getPoint())
					|| (cardPoint[1] == cardPoint[2]
							&& cardPoint[1] == Game.player.getHold().get(0)
									.getPoint() && cardPoint[2] == Game.player
							.getHold().get(1).getPoint())) {
				// / 底牌为一对次好牌
				Game.player.setCardAbility(2);
				Game.player.setHoldInfluence(2);

				cardAbility = 2;
				return cardAbility;
			} else {
				Game.player.setCardAbility(3);
				cardAbility = 3;
			}
		}

		if ((cardColor[0] == cardColor[1] && cardColor[1] == cardColor[2] && cardColor[2] == cardColor[3])
				|| (cardColor[0] == cardColor[1]
						&& cardColor[1] == cardColor[2] && cardColor[2] == cardColor[4])
				|| (cardColor[0] == cardColor[1]
						&& cardColor[1] == cardColor[3] && cardColor[3] == cardColor[4])
				|| (cardColor[0] == cardColor[2]
						&& cardColor[2] == cardColor[3] && cardColor[3] == cardColor[4])
				|| (cardColor[1] == cardColor[2]
						&& cardColor[2] == cardColor[3] && cardColor[3] == cardColor[4])) {
			// 补牌同花
			Game.player.setCardAbility(8);
			cardAbility = 8;
			return cardAbility;
		}

		if ((cardPoint[0] + 1 == cardPoint[1]
				&& cardPoint[1] + 1 == cardPoint[2] && cardPoint[2] + 1 == cardPoint[3])
				|| (cardPoint[1] + 1 == cardPoint[2]
						&& cardPoint[2] + 1 == cardPoint[3] && cardPoint[3] + 1 == cardPoint[4])
				|| (cardPointNum[0] + 1 == cardPointNum[1]
						&& cardPointNum[1] + 1 == cardPointNum[2] && cardPointNum[2] + 1 == cardPointNum[3])) {
			// 4张连顺
			Game.player.setCardAbility(8);
			cardAbility = 8;
			return cardAbility;
		}
		return cardAbility;
	}

	public int getSixSevenCardJudge(int cardAblity) {

		int holdInfluence = Game.player.getHoldInfluence();

		int action = 5;
		int style = 6;

		int maxBet = 0;
		int bet = 0;
		int currentAction = 0;
		int jetton = 0;

		ArrayList<Integer> actions = new ArrayList<Integer>();

		// for (int i = 0; i < actions.size(); i++) {
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " the SixSeven first actions "
		// + String.valueOf(actions.get(i)) + "\r\n");
		// }

		for (int i = 0; i < Game.personHashMap.size(); i++) {
			if (Game.my_id != Game.personHashMap.get(
					Game.personStationHashMap.get(i)).getPid()) {
				bet = Game.personHashMap.get(Game.personStationHashMap.get(i))
						.getBet();

				// 目前最大下注，即跟注需要的赌注
				if (bet > maxBet) {
					maxBet = bet;
				}
				actions.add(Game.personHashMap.get(
						Game.personStationHashMap.get(i)).getAction());

				currentAction = Game.personHashMap.get(
						Game.personStationHashMap.get(i)).getAction();

				if (currentAction == 4) {
					jetton = Game.personHashMap.get(
							Game.personStationHashMap.get(i)).getJetton();
					if (jetton > maxBet) {
						maxBet = jetton;
					}
				}
			}
		}

//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				" the SixSeven cardAbility " + cardAblity);
//
//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				"the five bigMulitple " + bigMulitple);
//
//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				" the SixSeven mulitpleMoney " + mulitpleMoney);
//
//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				" the SixSeven mulitple " + mulitple);
//
//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				" the SixSeven Station " + Game.player.getStation());
//
//		WritetoFile.getInstance(Game.my_id).writeMsg("the maxBet " + maxBet);
//
//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				"the SixSeven actions Size " + actions.size());
//
//		for (int i = 0; i < actions.size(); i++) {
//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					" the SixSeven actions " + String.valueOf(actions.get(i))
//							+ "\r\n");
//		}

		if (!actions.contains(0) && !actions.contains(1)
				&& !actions.contains(2) && !actions.contains(3)
				&& !actions.contains(4)) {
			// 全部弃牌
		} else {
			if (cardAblity == 0) {
				action = getWeapon(cardAblity, actions, holdInfluence, maxBet,
						style);
			} else if (cardAblity == 1) {// 强牌
				action = getWeapon(cardAblity, actions, holdInfluence, maxBet,
						style);
			} else if (cardAblity == 2) {// 中等强牌
				action = getWeapon(cardAblity, actions, holdInfluence, maxBet,
						style);
			} else if (cardAblity == 3) {// 差牌
				action = getWeapon(cardAblity, actions, holdInfluence, maxBet,
						style);
			} else if (cardAblity == 4) {// 天牌
				action = getWeapon(cardAblity, actions, holdInfluence, maxBet,
						style);
			} else if (cardAblity == 5) {// 地牌
				action = getWeapon(cardAblity, actions, holdInfluence, maxBet,
						style);
			} else if (cardAblity == 8) {// 补牌
				action = getWeapon(cardAblity, actions, holdInfluence, maxBet,
						style);
			}
		}
		return action;
	}

	public int getFiveCardJudge(int cardAblity) {

		int holdInfluence = Game.player.getHoldInfluence();

//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				"the hold influence is" + holdInfluence);

		int action = 5;

		int maxBet = 0;
		int bet = 0;
		int currentAction = 0;
		int jetton = 0;

		int style = 5;

		ArrayList<Integer> actions = new ArrayList<Integer>();

//		for (int i = 0; i < actions.size(); i++) {
//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"the fivefirst actions " + String.valueOf(actions.get(i))
//							+ "\r\n");
//		}

		for (int i = 0; i < Game.personHashMap.size(); i++) {
			if (Game.my_id != Game.personHashMap.get(
					Game.personStationHashMap.get(i)).getPid()) {
				bet = Game.personHashMap.get(Game.personStationHashMap.get(i))
						.getBet();

				// 目前最大下注，即跟注需要的赌注
				if (bet > maxBet) {
					maxBet = bet;
				}

				actions.add(Game.personHashMap.get(
						Game.personStationHashMap.get(i)).getAction());

				currentAction = Game.personHashMap.get(
						Game.personStationHashMap.get(i)).getAction();

				if (currentAction == 4) {
					jetton = Game.personHashMap.get(
							Game.personStationHashMap.get(i)).getJetton();
					if (jetton > maxBet) {
						maxBet = jetton;
					}
				}
			}
		}

//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				"the five Station " + Game.player.getStation());
//
//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				"the five bigMulitple " + bigMulitple);
//
//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				"the five cardAbility " + cardAblity);
//
//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				" the five mulitpleMoney " + mulitpleMoney);
//
//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				" the five maxDropMulitple " + maxDropMulitple);
//
//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				" the five mulitple " + mulitple);
//
//		WritetoFile.getInstance(Game.my_id).writeMsg("the maxBet " + maxBet);
//
//		WritetoFile.getInstance(Game.my_id).writeMsg(
//				"the five actions size " + actions.size());
//
//		for (int i = 0; i < actions.size(); i++) {
//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"the five actions " + String.valueOf(actions.get(i))
//							+ "\r\n");
//		}

		if (!actions.contains(0) && !actions.contains(1)
				&& !actions.contains(2) && !actions.contains(3)
				&& !actions.contains(4)) {
			// 全部弃牌
		} else {

			if (cardAblity == 0) {// 超强牌
				action = getWeapon(cardAblity, actions, holdInfluence, maxBet,
						style);
			} else if (cardAblity == 1) {// 强牌
				action = getWeapon(cardAblity, actions, holdInfluence, maxBet,
						style);
			} else if (cardAblity == 2) {// 中等强牌
				action = getWeapon(cardAblity, actions, holdInfluence, maxBet,
						style);
			} else if (cardAblity == 3) {// 差牌
				action = getWeapon(cardAblity, actions, holdInfluence, maxBet,
						style);
			} else if (cardAblity == 4) {// 天牌
				action = getWeapon(cardAblity, actions, holdInfluence, maxBet,
						style);
			} else if (cardAblity == 5) {// 地牌
				action = getWeapon(cardAblity, actions, holdInfluence, maxBet,
						style);
			} else if (cardAblity == 8) {// 补牌
				action = getWeapon(cardAblity, actions, holdInfluence, maxBet,
						style);
			}
		}
		return action;
	}

	private int getWeapon(int cardAbility, ArrayList<Integer> actions,
			int holdInfluence, int maxBet, int style) {

		int action = 5;

		switch (cardAbility) {
		case 0:

//			WritetoFile.getInstance(Game.my_id).writeMsg(" getWeapon 0 ");

			action = getBigCardStragy(maxBet, actions, style);

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"\r\n" + "the getWeapon is " + String.valueOf(action));

			break;

		case 1:

//			WritetoFile.getInstance(Game.my_id).writeMsg(" getWeapon 1 ");

			if (mulitple < 2) {
				mulitple = 2;
			}

			if (actions.contains(3) || actions.contains(4)) {
				if (style == 5) {
					if (holdInfluence > 0
							&& maxBet <= bigMulitple * (mulitple - 1)) {
						action = 2;
					} else {
						action = 5;
					}
				} else {
					if (holdInfluence > 0
							&& maxBet <= bigMulitple * (mulitple + 1)) {
						action = 2;
					} else {
						action = 5;
					}
				}

			} else {

				action = 1;
			}

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"the getWeapon is " + String.valueOf(action));

			break;

		case 2:

//			WritetoFile.getInstance(Game.my_id).writeMsg(" getWeapon 2 ");

			if (mulitple < 3) {
				mulitple = 3;
			}

			if (actions.contains(3) || actions.contains(4)) {
				if (style == 5) {
					if (holdInfluence >= 1
							&& maxBet <= bigMulitple * (mulitple - 2)) {
						action = 2;
					} else {
						action = 5;
					}
				} else {
					if (holdInfluence >= 1
							&& maxBet <= bigMulitple * (mulitple)) {
						action = 2;
					} else {
						action = 5;
					}
				}
			} else {
				action = 1;
			}

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"the getWeapon is " + String.valueOf(action));

			break;

		case 3:

//			WritetoFile.getInstance(Game.my_id).writeMsg(" getWeapon 3 ");

			if (actions.contains(3) || actions.contains(4)) {
				action = 5;
			} else {
				action = 2;
			}

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"the getWeapon is " + String.valueOf(action));

			break;
		case 4:

//			WritetoFile.getInstance(Game.my_id).writeMsg(" getWeapon 4 ");

			if (actions.contains(3) || actions.contains(4)) {
				action = 2;
			} else {
				action = 3;
			}

			if (style == 5) {
				PlayerCore.getInstance().setRaise(bigMulitple * 4);
			} else {
				PlayerCore.getInstance().setRaise(bigMulitple * 6);
			}

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"the getWeapon is " + String.valueOf(action));

			break;

		case 5:

//			WritetoFile.getInstance(Game.my_id).writeMsg(" getWeapon 5 ");

			if (actions.contains(3) || actions.contains(4)) {
				action = 2;
			} else {
				action = 3;
			}

			if (style == 5) {
				PlayerCore.getInstance().setRaise(bigMulitple * 3);
			} else {
				PlayerCore.getInstance().setRaise(bigMulitple * 5);
			}

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"the getWeapon is " + String.valueOf(action));

			break;

		case 8:

//			WritetoFile.getInstance(Game.my_id).writeMsg(" getWeapon 8 ");

			if (mulitple < 4) {
				mulitple = 4;
			}

			if (style == 5) {
				if (actions.contains(3) || actions.contains(4)) {
					if (holdInfluence > 1
							&& maxBet <= bigMulitple * (mulitple - 3)) {
						action = 2;
					} else {
						action = 5;
					}
				} else {
					action = 1;
				}
			} else {
				if (actions.contains(3) || actions.contains(4)) {
					action = 5;
				} else {
					action = 1;
				}
			}

//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"the getWeapon is " + String.valueOf(action));

			break;

		default:
			break;
		}
		return action;
	}

	private int getBigCardStragy(int maxBet, ArrayList<Integer> actions,
			int style) {

		int action = 5;

		int[] cardPoint = new int[5];
		int[] cardColor = new int[5];
		int[] cardPointNum = new int[5];
		int holdInfluence = Game.player.getHoldInfluence();

		cardPoint[0] = cardList.get(0).getPoint();
		cardPoint[1] = cardList.get(1).getPoint();
		cardPoint[2] = cardList.get(2).getPoint();
		cardPoint[3] = cardList.get(3).getPoint();
		cardPoint[4] = cardList.get(4).getPoint();

		cardColor[0] = cardList.get(0).getColor();
		cardColor[1] = cardList.get(1).getColor();
		cardColor[2] = cardList.get(2).getColor();
		cardColor[3] = cardList.get(3).getColor();
		cardColor[4] = cardList.get(4).getColor();

		Arrays.sort(cardPoint);

//		for (int i = 0; i < 5; i++) {
//			WritetoFile.getInstance(Game.my_id).writeMsg(
//					"\r\n" + " BigCardStragy cardPoint " + cardPoint[i]
//							+ " cardColor " + cardColor[i]);
//		}

		if (cardPoint[4] == 14) {
			cardPointNum[0] = 1;
			cardPointNum[1] = cardPoint[0];
			cardPointNum[2] = cardPoint[1];
			cardPointNum[3] = cardPoint[2];
			cardPointNum[4] = cardPoint[3];
		}

		// 两对
		if ((cardPoint[0] == cardPoint[1] && cardPoint[2] == cardPoint[3] && (cardPoint[0] > 10 || cardPoint[2] > 10))
				|| (cardPoint[0] == cardPoint[1]
						&& cardPoint[3] == cardPoint[4] && (cardPoint[0] > 10 || cardPoint[3] > 10))
				|| (cardPoint[1] == cardPoint[2]
						&& cardPoint[3] == cardPoint[4] && (cardPoint[1] > 10 || cardPoint[3] > 10))) {

			if (actions.contains(3) || actions.contains(4)) {

				if (holdInfluence == 2) {

					if (style == 5) {

						if (maxDropMulitple <= 4) {
							if (maxBet <= bigMulitple * 2) {
								action = 2;
							} else {
								action = 5;
							}
						} else {
							if (maxBet <= bigMulitple * (maxDropMulitple - 4)) {
								action = 2;
							} else {
								action = 5;
							}
						}

					} else {
						if (maxDropMulitple <= 4) {
							if (maxBet <= bigMulitple * 1) {
								action = 2;
							} else {
								action = 5;
							}
						} else {
							if (maxBet <= bigMulitple * (maxDropMulitple - 4)) {
								action = 2;
							} else {
								action = 5;
							}
						}
					}
				} else if (holdInfluence == 1) {
					if (style == 5) {
						if (maxDropMulitple <= 6) {
							if (maxBet <= bigMulitple * 1) {
								action = 2;
							} else {
								action = 5;
							}
						} else {
							if (maxBet <= bigMulitple * (maxDropMulitple - 6)) {
								action = 2;
							} else {
								action = 5;
							}
						}
					} else {
						if (maxDropMulitple <= 6) {
							if (maxBet <= bigMulitple * 1) {
								action = 2;
							} else {
								action = 5;
							}
						} else {
							if (maxBet <= bigMulitple * (maxDropMulitple - 6)) {
								action = 2;
							} else {
								action = 5;
							}
						}
					}
				} else {
					action = 5;
				}
			} else {

				if (holdInfluence == 2) {
					if (style == 5) {
						if (maxDropMulitple <= 8) {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 3);
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 5);
						}
					} else {
						action = 2;
					}
				} else if (holdInfluence == 1) {
					if (style == 5) {
						if (maxDropMulitple <= 8) {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 1);
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 5);
						}
					} else {
						action = 2;
					}
				} else {
					action = 5;
				}
			}
			return action;
		} else if ((cardPoint[0] == cardPoint[1] && cardPoint[1] == cardPoint[2])
				|| (cardPoint[1] == cardPoint[2] && cardPoint[2] == cardPoint[3])
				|| (cardPoint[2] == cardPoint[3] && cardPoint[3] == cardPoint[4])) {// 三条

			if (actions.contains(3) || actions.contains(4)) {
				if (holdInfluence == 2) {
					if (maxBet <= bigMulitple * maxDropMulitple) {
						action = 2;
					} else {
						action = 5;
					}
				} else if (holdInfluence == 1) {
					if (maxBet <= bigMulitple * (maxDropMulitple - 2)) {
						action = 2;
					} else {
						action = 5;
					}
				} else {
					if (maxDropMulitple <= 8) {
						if (maxBet <= bigMulitple * 1) {
							action = 2;
						} else {
							action = 5;
						}
					} else {
						if (maxBet <= bigMulitple * (maxDropMulitple - 8)) {
							action = 2;
						} else {
							action = 5;
						}
					}
				}
			} else {
				if (holdInfluence == 2) {
					if (style == 5) {

						if (maxDropMulitple <= 8) {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 1);
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 3);
						}
					} else {
						if (maxDropMulitple <= 8) {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 2);
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 6);
						}
					}
				} else if (holdInfluence == 1) {
					if (style == 5) {
						if (maxDropMulitple <= 8) {
							action = 2;
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 1);
						}
					} else {
						if (maxDropMulitple <= 8) {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 1);
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 3);
						}
					}
				} else {
					action = 2;
				}
			}
			return action;
		} else if ((cardPoint[0] + 1 == cardPoint[1]
				&& cardPoint[1] + 1 == cardPoint[2]
				&& cardPoint[2] + 1 == cardPoint[3] && cardPoint[3] + 1 == cardPoint[4])
				|| (cardPointNum[0] + 1 == cardPointNum[1]
						&& cardPointNum[1] + 1 == cardPointNum[2]
						&& cardPointNum[2] + 1 == cardPointNum[3] && cardPointNum[3] + 1 == cardPointNum[4])) {// 顺子
			// 顺子
			int maxHold = 0;
			int minHold = 0;
			if (Game.player.getHold().get(0).getPoint() > Game.player.getHold()
					.get(1).getPoint()) {
				maxHold = Game.player.getHold().get(0).getPoint();
				minHold = Game.player.getHold().get(1).getPoint();
			} else {
				maxHold = Game.player.getHold().get(1).getPoint();
				minHold = Game.player.getHold().get(0).getPoint();
			}

			if (actions.contains(3) || actions.contains(4)) {

				if ((minHold == cardPoint[0] && maxHold == cardPoint[1])
						|| (minHold == cardPointNum[0] && maxHold == cardPointNum[1])) {//
					if (maxBet <= bigMulitple * (maxDropMulitple - 4)) {// 6
						action = 2;
					} else {
						action = 5;
					}
				} else if ((minHold == cardPoint[3] && maxHold == cardPoint[4])
						|| (minHold == cardPointNum[3] && maxHold == cardPointNum[4])) {
					if (maxBet <= bigMulitple * maxDropMulitple) {// 10
						action = 2;
					} else {
						action = 5;
					}
				} else {
					if (maxBet <= bigMulitple * (maxDropMulitple - 2)) {// 8
						action = 2;
					} else {
						action = 5;
					}
				}
			} else {
				if (minHold == cardPoint[0] && maxHold == cardPoint[1]) {//
					if (style == 5) {

						if (maxDropMulitple <= 8) {
							action = 2;
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 1);
						}

					} else {
						if (maxDropMulitple <= 8) {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 3);
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 5);
						}

					}

				} else if (minHold == cardPoint[3] && maxHold == cardPoint[4]) {
					if (style == 5) {
						if (maxDropMulitple <= 8) {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 2);
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 4);
						}
					} else {
						if (maxDropMulitple <= 8) {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 4);
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 8);
						}
					}
				} else {
					if (style == 5) {
						if (maxDropMulitple <= 8) {
							action = 2;
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 1);
						}
					} else {
						if (maxDropMulitple <= 8) {
							action = 2;
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 2);
						}
					}
				}
			}
			return action;
		} else if (cardColor[0] == cardColor[1] && cardColor[1] == cardColor[2]
				&& cardColor[2] == cardColor[3] && cardColor[3] == cardColor[4]) {// 同花

			int maxHold = 0;
			int minHold = 0;
			if (Game.player.getHold().get(0).getPoint() > Game.player.getHold()
					.get(1).getPoint()) {
				maxHold = Game.player.getHold().get(0).getPoint();
				minHold = Game.player.getHold().get(1).getPoint();
			} else {
				maxHold = Game.player.getHold().get(1).getPoint();
				minHold = Game.player.getHold().get(0).getPoint();
			}

			if (actions.contains(3) || actions.contains(4)) {

				if (minHold == cardPoint[0] && maxHold == cardPoint[1]) {
					if (maxBet <= bigMulitple * maxDropMulitple) {
						action = 2;
					} else {
						action = 5;
					}
				} else if (maxHold == cardPoint[2]) {
					if (maxBet <= bigMulitple * (maxDropMulitple + 2)) {
						action = 2;
					} else {
						action = 5;
					}
				} else if (maxHold == cardPoint[3]) {
					if (maxBet <= bigMulitple * (maxDropMulitple + 5)) {
						action = 2;
					} else {
						action = 5;
					}
				} else if (maxHold == cardPoint[4]) {

					if (maxHold <= 10) {// 小于10
						if (maxBet <= bigMulitple * (maxDropMulitple + 5)) {
							action = 2;
						} else {
							action = 5;
						}
					} else if (maxHold == 14) {
						action = 2;
					} else {
						if (maxBet <= bigMulitple * maxDropMulitple * 2) {
							action = 2;
						} else {
							action = 5;
						}
					}

				} else {
					if (maxBet <= bigMulitple * (maxDropMulitple - 2)) {
						action = 2;
					} else {
						action = 5;
					}
				}
			} else {
				if (minHold == cardPoint[0] && maxHold == cardPoint[1]) {//
					if (style == 5) {
						action = 3;
						PlayerCore.getInstance().setRaise(bigMulitple * 1);
					} else {
						action = 3;
						PlayerCore.getInstance().setRaise(bigMulitple * 3);
					}
				} else if (maxHold == cardPoint[2]) {
					if (style == 5) {
						action = 3;
						PlayerCore.getInstance().setRaise(bigMulitple * 2);
					} else {
						action = 3;
						PlayerCore.getInstance().setRaise(bigMulitple * 4);
					}
				} else if (maxHold == cardPoint[3]) {
					if (style == 5) {
						action = 3;
						PlayerCore.getInstance().setRaise(bigMulitple * 3);
					} else {
						action = 3;
						PlayerCore.getInstance().setRaise(bigMulitple * 6);
					}
				} else if (maxHold == cardPoint[4]) {

					if (maxHold <= 10) {// 小于10
						if (style == 5) {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 4);
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 8);
						}
					} else if (maxHold == 14) {
						if (style == 5) {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 5);
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 10);
						}
					} else {
						if (style == 5) {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 5);
						} else {
							action = 3;
							PlayerCore.getInstance().setRaise(bigMulitple * 10);
						}
					}
				} else {
					action = 2;
				}
			}
		}
		return action;
	}

	private void getHoldInfluence(int[] cardPoint) {
		int num = 0;
		int cardHand1 = Game.player.getHold().get(0).getPoint();
		int cardHand2 = Game.player.getHold().get(1).getPoint();
		for (int i = 0; i < cardPoint.length; i++) {
			if (cardPoint[i] == cardHand1 || cardPoint[i] == cardHand2) {
				num++;
			}
		}
		if (num > 2)
			num = 2;
		Game.player.setHoldInfluence(num);
	}
}