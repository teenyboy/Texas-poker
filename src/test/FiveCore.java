package test;

import java.util.ArrayList;

public class FiveCore {

	public FiveCore() {
		// TODO Auto-generated constructor stub
	}

	public int getFiveCore() {

		ArrayList<Card> holdCards = Game.personHashMap.get(Game.my_id)
				.getHold();

		ArrayList<Card> flopCards = Competition.getInstance().getFlopCards();
		// 凑出手牌
		ArrayList<Card> cards = new ArrayList<Card>();

		CardJudge cardJudge = new CardJudge();

		int action = 5;

		cards.add(holdCards.get(0));
		cards.add(holdCards.get(1));
		cards.add(flopCards.get(0));
		cards.add(flopCards.get(1));
		cards.add(flopCards.get(2));

		// 定义牌型
		int cardAbility = cardJudge.setCardJudge(cards, 1);

		// 获取决策
		action = cardJudge.getFiveCardJudge(cardAbility);

		return action;
	}
}
