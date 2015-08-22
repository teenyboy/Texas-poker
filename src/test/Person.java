package test;

import java.util.ArrayList;

//选手信息
public class Person {

	// private static Object object = new Object();
	private int pid = 0;// id
	private int jetton = 0;// 筹码
	private int money = 0;// 金币
	private boolean IsButton = false;// 是否是庄家
	private boolean IsBigBlind = false;// 是否是大盲注
	private boolean IsSmallBlind = false;// 是否是小盲注
	private int bet = 0;// 赌注
	private int action = -1;// 动作
	private int winProbility = 0;// 赢得概率
	private ArrayList<Card> hold = new ArrayList<Card>();// 手牌
	private int identity = 0;// 身份
	private int rank = 0;// 排名
	private int nutHand = 0;// 牌型
	private int winPot = 0;// 赢得奖金
	private int station = 0;// 位置
	private int cardAbility = 0; // 0超强，1强，2中等强， 3弱,4天牌，5地牌，6一般强，7，小牌,8补牌
	private int holdInfluence = 0;// 底牌影响 0张 1张 2张
	private int winCount = 0;// 赢得局数
//	private boolean IsEndStation = false;
//
//	public boolean isIsEndStation() {
//		return IsEndStation;
//	}
//
//	public void setIsEndStation(boolean isEndStation) {
//		IsEndStation = isEndStation;
//	}

	public void clearPersonMsg() {
		bet = 0;
		action = -1;
		hold.clear();
		rank = 0;
		nutHand = 0;
		winPot = 0;
		station = 0;
		cardAbility = 0;
		holdInfluence = 0;
	}

	public int getWinCount() {
		return winCount;
	}

	public void setWinCount() {
		this.winCount++;
	}

	public int getHoldInfluence() {
		return holdInfluence;
	}

	public void setHoldInfluence(int holdInfluence) {
		this.holdInfluence = holdInfluence;
	}

	public int getStation() {
		return station;
	}

	public void setStation(int station) {
		this.station = station;
	}

	public int getCardAbility() {
		return cardAbility;
	}

	public void setCardAbility(int cardAbility) {
		this.cardAbility = cardAbility;
	}

	public int getWinPot() {
		return winPot;
	}

	public void setWinPot(int winPot) {
		this.winPot = winPot;
	}

	public int getNutHand() {
		return nutHand;
	}

	public void setNutHand(String nutHand) {
		this.nutHand = NutHandState.getNutHandState(nutHand);
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	// private static Person person = null;

	// public static Person getInstance() {
	// if (person == null) {
	// synchronized (object) {
	// if (person == null) {
	// person = new Person();
	// }
	// }
	// }
	// return person;
	// }

	public int getPid() {
		return pid;
	}

	public int getWinProbility() {
		return winProbility;
	}

	public void setWinProbility(int winProbility) {
		this.winProbility = winProbility;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getJetton() {
		return jetton;
	}

	public void setJetton(int jetton) {
		this.jetton = jetton;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public boolean isIsButton() {
		return IsButton;
	}

	public void setIsButton(boolean isButton) {
		IsButton = isButton;
	}

	public boolean isIsBigBlind() {
		return IsBigBlind;
	}

	public void setIsBigBlind(boolean isBigBlind) {
		IsBigBlind = isBigBlind;
	}

	public boolean isIsSmallBlind() {
		return IsSmallBlind;
	}

	public void setIsSmallBlind(boolean isSmallBlind) {
		IsSmallBlind = isSmallBlind;
	}

	public int getBet() {
		return bet;
	}

	public void setBet(int bet) {
		this.bet = bet;
	}

	public int getAction() {
		return action;
	}

	public void setAction(String action) {

		this.action = ActionState.getActionState(action);
	}

	public ArrayList<Card> getHold() {
		return hold;
	}

	public void setHold(ArrayList<Card> hold) {
		this.hold = hold;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

}
