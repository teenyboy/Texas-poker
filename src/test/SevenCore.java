package test;

import java.util.ArrayList;

public class SevenCore {

	private int maxNum = 6;
	private ArrayList<Integer> maxList = new ArrayList<Integer>();

	ArrayList<Card> holdCards = Game.personHashMap.get(Game.my_id).getHold();

	ArrayList<Card> flopCards = Competition.getInstance().getFlopCards();

	ArrayList<Card> turnCards = Competition.getInstance().getTurnCards();

	ArrayList<Card> riverCards = Competition.getInstance().getRiverCards();

	CardJudge cardJudge = new CardJudge();

	// 凑出手牌
	ArrayList<Card> cards = new ArrayList<Card>();

	public SevenCore() {
		// TODO Auto-generated constructor stub
	}

	public int getSevenCore() {

		int action = 5;
		int cardAbility = 0;

		// 12345
		cards.add(holdCards.get(0));
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(1));
		cards.add(flopCards.get(2));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 1);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 1 stragy is " + cardAbility);

		cards.clear();

		// 12346
		cards.add(holdCards.get(0));
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(1));
		cards.add(turnCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 2);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 2 stragy is " + cardAbility);

		cards.clear();

		// 12347
		cards.add(holdCards.get(0));
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(1));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 3);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 3 stragy is " + cardAbility);
		cards.clear();

		// 12356
		cards.add(holdCards.get(0));
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(2));
		cards.add(turnCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 4);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 4 stragy is " + cardAbility);
		cards.clear();

		// 12357
		cards.add(holdCards.get(0));
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(2));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 5);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 5 stragy is " + cardAbility);
		cards.clear();

		// 12367
		cards.add(holdCards.get(0));
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(0));
		cards.add(turnCards.get(0));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 6);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 6 stragy is " + cardAbility);
		cards.clear();

		// 12456
		cards.add(holdCards.get(0));
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(1));
		cards.add(flopCards.get(2));
		cards.add(turnCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 7);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 7 stragy is " + cardAbility);
		cards.clear();

		// 12457
		cards.add(holdCards.get(0));
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(1));
		cards.add(flopCards.get(2));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 8);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 8 stragy is " + cardAbility);
		cards.clear();

		// 12567
		cards.add(holdCards.get(0));
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(2));
		cards.add(turnCards.get(0));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 9);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 9 stragy is " + cardAbility);
		cards.clear();

		// 13467
		cards.add(holdCards.get(0));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(1));
		cards.add(turnCards.get(0));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 10);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 10 stragy is " + cardAbility);
		cards.clear();

		// 13567
		cards.add(holdCards.get(0));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(2));
		cards.add(turnCards.get(0));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 11);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 11 stragy is " + cardAbility);
		cards.clear();

		// 13456
		cards.add(holdCards.get(0));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(1));
		cards.add(flopCards.get(2));
		cards.add(turnCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 12);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 12 stragy is " + cardAbility);
		cards.clear();

		// 13457
		cards.add(holdCards.get(0));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(1));
		cards.add(flopCards.get(2));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 13);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 13 stragy is " + cardAbility);
		cards.clear();

		// 14567
		cards.add(holdCards.get(0));
		cards.add(flopCards.get(1));
		cards.add(flopCards.get(2));
		cards.add(turnCards.get(0));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 14);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 14 stragy is " + cardAbility);
		cards.clear();

		// 23456
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(1));
		cards.add(flopCards.get(2));
		cards.add(turnCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 15);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 15 stragy is " + cardAbility);
		cards.clear();

		// 23457
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(1));
		cards.add(flopCards.get(2));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 16);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 16 stragy is " + cardAbility);
		cards.clear();

		// 24567
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(1));
		cards.add(flopCards.get(2));
		cards.add(turnCards.get(0));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 17);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 17 stragy is " + cardAbility);
		cards.clear();

		// 23567
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(2));
		cards.add(turnCards.get(0));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 18);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 18 stragy is " + cardAbility);
		cards.clear();

		// 23467
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(1));
		cards.add(turnCards.get(0));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 19);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 19 stragy is " + cardAbility);
		cards.clear();

		// 13467
		cards.add(holdCards.get(0));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(1));
		cards.add(turnCards.get(0));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 20);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 20 stragy is " + cardAbility);
		cards.clear();

		// 34567
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(1));
		cards.add(flopCards.get(2));
		cards.add(turnCards.get(0));
		cards.add(riverCards.get(0));

		// 定义牌型
		cardAbility = cardJudge.setCardJudge(cards, 0);
		getMax(cardAbility, 21);
		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " 21 stragy is " + cardAbility);
		cards.clear();

		cardAbility = getEndAbility();

		// WritetoFile.getInstance(Game.my_id).writeMsg(" maxNum is " + maxNum);

		// WritetoFile.getInstance(Game.my_id).writeMsg(
		// " end stragy is " + cardAbility);

		getCardList();// 重新写入最大值

		// 获取决策
		action = cardJudge.getSixSevenCardJudge(cardAbility);

		return action;
	}

	private void getMax(int cardAbility, int cardNum) {

		int cardChangeAbility = -1;

		switch (cardAbility) {
		case 0:
			cardChangeAbility = 2;
			break;
		case 1:
			cardChangeAbility = 3;
			break;
		case 2:
			cardChangeAbility = 4;
			break;
		case 4:
			cardChangeAbility = 0;
			break;
		case 5:
			cardChangeAbility = 1;
			break;
		case 8:
			cardChangeAbility = 5;
			break;
		default:
			cardChangeAbility = 6;
			break;
		}
		if (cardChangeAbility <= maxNum) {
			if (cardChangeAbility < maxNum) {
				maxList.clear();
			}
			maxNum = cardChangeAbility;
			maxList.add(cardNum);
		}
	}

	private int getEndAbility() {

		int cardAbility = -1;

		switch (maxNum) {
		case 0:
			cardAbility = 4;
			break;
		case 1:
			cardAbility = 5;
			break;
		case 2:
			cardAbility = 0;
			break;
		case 3:
			cardAbility = 1;
			break;
		case 4:
			cardAbility = 2;
			break;
		case 5:
			cardAbility = 8;
			break;

		default:
			cardAbility = 3;
			break;
		}
		return cardAbility;
	}

	public void getCardList() {

		int maxNum = 0;

		for (int i = 0; i < maxList.size(); i++) {
			switch (maxList.get(i)) {
			case 1:

				if ((holdCards.get(0).getPoint() + holdCards.get(1).getPoint()
						+ flopCards.get(0).getPoint()
						+ flopCards.get(1).getPoint() + flopCards.get(2)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 1");

					cards.clear();

					cards.add(holdCards.get(0));
					cards.add(holdCards.get(1));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(1));
					cards.add(flopCards.get(2));

					maxNum = holdCards.get(0).getPoint()
							+ holdCards.get(1).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(1).getPoint()
							+ flopCards.get(2).getPoint();
				}

				break;
			case 2:

				if ((holdCards.get(0).getPoint() + holdCards.get(1).getPoint()
						+ flopCards.get(0).getPoint()
						+ flopCards.get(1).getPoint() + turnCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 2");

					cards.clear();

					cards.add(holdCards.get(0));
					cards.add(holdCards.get(1));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(1));
					cards.add(turnCards.get(0));

					maxNum = holdCards.get(0).getPoint()
							+ holdCards.get(1).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(1).getPoint()
							+ turnCards.get(0).getPoint();
				}

				break;
			case 3:

				if ((holdCards.get(0).getPoint() + holdCards.get(1).getPoint()
						+ flopCards.get(0).getPoint()
						+ flopCards.get(1).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 3");

					cards.clear();

					cards.add(holdCards.get(0));
					cards.add(holdCards.get(1));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(1));
					cards.add(riverCards.get(0));

					maxNum = holdCards.get(0).getPoint()
							+ holdCards.get(1).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(1).getPoint()
							+ riverCards.get(0).getPoint();
				}
				break;
			case 4:

				if ((holdCards.get(0).getPoint() + flopCards.get(1).getPoint()
						+ flopCards.get(0).getPoint()
						+ flopCards.get(2).getPoint() + turnCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 4");

					cards.clear();

					cards.add(holdCards.get(0));
					cards.add(holdCards.get(1));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(2));
					cards.add(turnCards.get(0));

					maxNum = holdCards.get(0).getPoint()
							+ flopCards.get(1).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(2).getPoint()
							+ turnCards.get(0).getPoint();
				}
				break;
			case 5:
				if ((holdCards.get(0).getPoint() + holdCards.get(1).getPoint()
						+ flopCards.get(0).getPoint()
						+ flopCards.get(2).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 5");

					cards.clear();

					cards.add(holdCards.get(0));
					cards.add(holdCards.get(1));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(2));
					cards.add(riverCards.get(0));

					maxNum = holdCards.get(0).getPoint()
							+ holdCards.get(1).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(2).getPoint()
							+ riverCards.get(0).getPoint();
				}
				break;
			case 6:

				if ((holdCards.get(0).getPoint() + holdCards.get(1).getPoint()
						+ flopCards.get(0).getPoint()
						+ turnCards.get(0).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 6");

					cards.clear();
					cards.add(holdCards.get(0));
					cards.add(holdCards.get(1));
					cards.add(flopCards.get(0));
					cards.add(turnCards.get(0));
					cards.add(riverCards.get(0));

					maxNum = holdCards.get(0).getPoint()
							+ holdCards.get(1).getPoint()
							+ flopCards.get(0).getPoint()
							+ turnCards.get(0).getPoint()
							+ riverCards.get(0).getPoint();
				}

				break;

			case 7:

				if ((holdCards.get(0).getPoint() + holdCards.get(1).getPoint()
						+ flopCards.get(1).getPoint()
						+ flopCards.get(2).getPoint() + turnCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 7");

					cards.clear();

					cards.add(holdCards.get(0));
					cards.add(holdCards.get(1));
					cards.add(flopCards.get(1));
					cards.add(flopCards.get(2));
					cards.add(turnCards.get(0));

					maxNum = holdCards.get(0).getPoint()
							+ holdCards.get(1).getPoint()
							+ flopCards.get(1).getPoint()
							+ flopCards.get(2).getPoint()
							+ turnCards.get(0).getPoint();
				}

				break;
			case 8:

				if ((holdCards.get(0).getPoint() + holdCards.get(1).getPoint()
						+ flopCards.get(1).getPoint()
						+ flopCards.get(2).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 8");

					cards.clear();

					cards.add(holdCards.get(0));
					cards.add(holdCards.get(1));
					cards.add(flopCards.get(1));
					cards.add(flopCards.get(2));
					cards.add(riverCards.get(0));

					maxNum = holdCards.get(0).getPoint()
							+ holdCards.get(1).getPoint()
							+ flopCards.get(1).getPoint()
							+ flopCards.get(2).getPoint()
							+ riverCards.get(0).getPoint();
				}

				break;
			case 9:

				if ((holdCards.get(0).getPoint() + holdCards.get(1).getPoint()
						+ flopCards.get(2).getPoint()
						+ turnCards.get(0).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 9");

					cards.clear();

					cards.add(holdCards.get(0));
					cards.add(holdCards.get(1));
					cards.add(flopCards.get(2));
					cards.add(turnCards.get(0));
					cards.add(riverCards.get(0));

					maxNum = holdCards.get(0).getPoint()
							+ holdCards.get(1).getPoint()
							+ flopCards.get(2).getPoint()
							+ turnCards.get(0).getPoint()
							+ riverCards.get(0).getPoint();
				}
				break;
			case 10:

				if ((holdCards.get(0).getPoint() + flopCards.get(0).getPoint()
						+ flopCards.get(1).getPoint()
						+ turnCards.get(0).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 10");

					cards.clear();

					cards.add(holdCards.get(0));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(1));
					cards.add(turnCards.get(0));
					cards.add(riverCards.get(0));

					maxNum = holdCards.get(0).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(1).getPoint()
							+ turnCards.get(0).getPoint()
							+ riverCards.get(0).getPoint();
				}
				break;
			case 11:
				if ((holdCards.get(0).getPoint() + flopCards.get(0).getPoint()
						+ flopCards.get(2).getPoint()
						+ turnCards.get(0).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 11");

					cards.clear();

					cards.add(holdCards.get(0));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(2));
					cards.add(turnCards.get(0));
					cards.add(riverCards.get(0));

					maxNum = holdCards.get(0).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(2).getPoint()
							+ turnCards.get(0).getPoint()
							+ riverCards.get(0).getPoint();
				}
				break;
			case 12:

				if ((holdCards.get(0).getPoint() + flopCards.get(0).getPoint()
						+ flopCards.get(1).getPoint()
						+ flopCards.get(2).getPoint() + turnCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 12");

					cards.clear();
					cards.add(holdCards.get(0));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(1));
					cards.add(flopCards.get(2));
					cards.add(turnCards.get(0));

					maxNum = holdCards.get(0).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(1).getPoint()
							+ flopCards.get(2).getPoint()
							+ turnCards.get(0).getPoint();
				}

				break;

			case 13:

				if ((holdCards.get(0).getPoint() + flopCards.get(0).getPoint()
						+ flopCards.get(1).getPoint()
						+ flopCards.get(2).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 13");

					cards.clear();

					cards.add(holdCards.get(0));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(1));
					cards.add(flopCards.get(2));
					cards.add(riverCards.get(0));

					maxNum = holdCards.get(0).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(1).getPoint()
							+ flopCards.get(2).getPoint()
							+ riverCards.get(0).getPoint();
				}

				break;
			case 14:

				if ((holdCards.get(0).getPoint() + flopCards.get(1).getPoint()
						+ flopCards.get(2).getPoint()
						+ turnCards.get(0).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 14");

					cards.clear();

					cards.add(holdCards.get(0));
					cards.add(flopCards.get(1));
					cards.add(flopCards.get(2));
					cards.add(turnCards.get(0));
					cards.add(riverCards.get(0));

					maxNum = holdCards.get(0).getPoint()
							+ flopCards.get(1).getPoint()
							+ flopCards.get(2).getPoint()
							+ turnCards.get(0).getPoint()
							+ riverCards.get(0).getPoint();
				}

				break;
			case 15:

				if ((holdCards.get(1).getPoint() + flopCards.get(2).getPoint()
						+ flopCards.get(0).getPoint()
						+ flopCards.get(1).getPoint() + turnCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 15");

					cards.clear();

					cards.add(holdCards.get(1));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(1));
					cards.add(flopCards.get(2));
					cards.add(turnCards.get(0));

					maxNum = holdCards.get(1).getPoint()
							+ flopCards.get(2).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(1).getPoint()
							+ turnCards.get(0).getPoint();
				}
				break;
			case 16:

				if ((holdCards.get(1).getPoint() + flopCards.get(0).getPoint()
						+ flopCards.get(1).getPoint()
						+ flopCards.get(2).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 16");

					cards.clear();

					cards.add(holdCards.get(1));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(1));
					cards.add(flopCards.get(2));
					cards.add(riverCards.get(0));

					maxNum = holdCards.get(1).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(1).getPoint()
							+ flopCards.get(2).getPoint()
							+ riverCards.get(0).getPoint();
				}
				break;
			case 17:
				if ((holdCards.get(1).getPoint() + flopCards.get(0).getPoint()
						+ flopCards.get(2).getPoint()
						+ turnCards.get(0).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 17");

					cards.clear();

					cards.add(holdCards.get(1));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(2));
					cards.add(turnCards.get(0));
					cards.add(riverCards.get(0));

					maxNum = holdCards.get(1).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(2).getPoint()
							+ turnCards.get(0).getPoint()
							+ riverCards.get(0).getPoint();
				}
				break;
			case 18:

				if ((holdCards.get(1).getPoint() + flopCards.get(0).getPoint()
						+ flopCards.get(2).getPoint()
						+ turnCards.get(0).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 18");

					cards.clear();
					cards.add(holdCards.get(1));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(2));
					cards.add(turnCards.get(0));
					cards.add(riverCards.get(0));

					maxNum = holdCards.get(1).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(2).getPoint()
							+ turnCards.get(0).getPoint()
							+ riverCards.get(0).getPoint();
				}

				break;

			case 19:

				if ((holdCards.get(1).getPoint() + flopCards.get(0).getPoint()
						+ flopCards.get(1).getPoint()
						+ turnCards.get(0).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 19");

					cards.clear();

					cards.add(holdCards.get(1));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(1));
					cards.add(turnCards.get(0));
					cards.add(riverCards.get(0));

					maxNum = holdCards.get(1).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(1).getPoint()
							+ turnCards.get(0).getPoint()
							+ riverCards.get(0).getPoint();
				}

				break;
			case 20:

				if ((holdCards.get(0).getPoint() + flopCards.get(0).getPoint()
						+ flopCards.get(1).getPoint()
						+ turnCards.get(0).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 20");

					cards.clear();

					cards.add(holdCards.get(0));
					cards.add(flopCards.get(0));
					cards.add(flopCards.get(1));
					cards.add(turnCards.get(0));
					cards.add(riverCards.get(0));

					maxNum = holdCards.get(0).getPoint()
							+ flopCards.get(0).getPoint()
							+ flopCards.get(1).getPoint()
							+ turnCards.get(0).getPoint()
							+ riverCards.get(0).getPoint();
				}

				break;
			case 21:

				if ((flopCards.get(0).getPoint() + flopCards.get(1).getPoint()
						+ flopCards.get(2).getPoint()
						+ turnCards.get(0).getPoint() + riverCards.get(0)
						.getPoint()) > maxNum) {

					// WritetoFile.getInstance(Game.my_id).writeMsg(
					// " the max card is 21");

					cards.clear();

					cards.add(flopCards.get(0));
					cards.add(flopCards.get(1));
					cards.add(flopCards.get(2));
					cards.add(turnCards.get(0));
					cards.add(riverCards.get(0));

					maxNum = flopCards.get(0).getPoint()
							+ flopCards.get(1).getPoint()
							+ flopCards.get(2).getPoint()
							+ turnCards.get(0).getPoint()
							+ riverCards.get(0).getPoint();
				}
				break;
			default:
				break;
			}
		}
		// 定义牌型
		cardJudge.setCardJudge(cards, 1);
	}

}
