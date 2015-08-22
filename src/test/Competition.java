package test;

import java.util.ArrayList;

//比赛信息
public class Competition {

	private static Object object = new Object();
	// 回合数
	private int handcount = 1;
	// 庄家
	private int button = 0;
	// 大盲注
	private int bigBlind = 0;
	// 小盲注
	private int smallBlind = 0;
	// pot
	private int pot = 0;
	// 现存人数
	private int personCount = 0;
	// 总人数
	private int allPersonCount = 0;

	public int maxMoney = 6000;

	private ArrayList<Card> flopCards = new ArrayList<Card>();
	private ArrayList<Card> turnCards = new ArrayList<Card>();
	private ArrayList<Card> riverCards = new ArrayList<Card>();

	private ArrayList<Card> fiveCards = new ArrayList<Card>();
	private ArrayList<Card> sixCards = new ArrayList<Card>();
	private ArrayList<Card> sevenCards = new ArrayList<Card>();

	private long allTime = 0;
	private long averTime = 0;
	public static long allAverTime = 0;

	public boolean bigblind = false;
	public int bigMoney = 0;
	public int multilpeMoney = 0;
	private int multilpe = 4;
	private int maxDropMultilpe = 10;

	public int getMaxDropMultilpe() {

		if (maxDropMultilpe < 6) {
			multilpe = 6;
		}
		return maxDropMultilpe;
	}

	public void setMaxDropMultilpe(int maxDropMultilpe) {
		this.maxDropMultilpe = maxDropMultilpe;
	}

	public ArrayList<Card> getFiveCards() {
		return fiveCards;
	}

	public void setFiveCards(ArrayList<Card> fiveCards) {
		this.fiveCards = fiveCards;
	}

	public ArrayList<Card> getSixCards() {
		return sixCards;
	}

	public void setSixCards(ArrayList<Card> sixCards) {
		this.sixCards = sixCards;
	}

	public ArrayList<Card> getSevenCards() {
		return sevenCards;
	}

	public void setSevenCards(ArrayList<Card> sevenCards) {
		this.sevenCards = sevenCards;
	}

	public int getAllPersonCount() {
		return allPersonCount;
	}

	public void setAllPersonCount(int allPersonCount) {
		this.allPersonCount = allPersonCount;
	}

	public int getMultilpe() {
		if (multilpe < 1) {
			multilpe = 1;
		}
		return multilpe;
	}

	public void setMultilpe(int multilpe) {
		this.multilpe = multilpe;
	}

	public long getAllTime() {
		return allTime;
	}

	public void setAllTime(long allTime) {
		this.allTime = allTime;
	}

	public long getAverTime() {
		return averTime;
	}

	public void setAverTime(long averTime) {
		this.averTime = averTime;
	}

	public void clearCompetitionMsg() {
		button = 0;
		bigBlind = 0;
		smallBlind = 0;
		pot = 0;
		personCount = 0;
		allPersonCount = 0;
		multilpeMoney = 0;
		flopCards.clear();
		turnCards.clear();
		riverCards.clear();
		multilpe = 4;
		bigblind = false;
		fiveCards.clear();
		sixCards.clear();
		sevenCards.clear();
		Game.personHashMap.clear();
		Game.personStationHashMap.clear();
	}

	public ArrayList<Card> getRiverCards() {
		return riverCards;
	}

	public void setRiverCards(ArrayList<Card> riverCards) {
		this.riverCards = riverCards;
	}

	public ArrayList<Card> getTurnCards() {
		return turnCards;
	}

	public void setTurnCards(ArrayList<Card> turnCards) {
		this.turnCards = turnCards;
	}

	public ArrayList<Card> getFlopCards() {
		return flopCards;
	}

	public void setFlopCards(ArrayList<Card> flopCards) {
		this.flopCards = flopCards;
	}

	private static Competition competition = null;

	private Competition() {
		// TODO Auto-generated constructor stub
	}

	public static Competition getInstance() {
		if (competition == null) {
			synchronized (object) {
				if (competition == null) {
					competition = new Competition();
				}
			}
		}
		return competition;
	}

	public int getPersonCount() {
		return personCount;
	}

	public void setPersonCount(int personCount) {
		this.personCount = personCount;
	}

	public int getPot() {
		return pot;
	}

	public void setPot(int pot) {
		this.pot = pot;
	}

	public int getHandcount() {
		return handcount;
	}

	public void setHandcount() {
		this.handcount++;
	}

	public void setButton(int button) {
		this.button = button;
	}

	public int getButton() {
		return button;
	}

	public int getBigBlind() {
		return bigBlind;
	}

	public void setBigBlind(int bigBlind) {
		this.bigBlind = bigBlind;
	}

	public int getSmallBlind() {
		return smallBlind;
	}

	public void setSmallBlind(int smallBlind) {
		this.smallBlind = smallBlind;
	}

}
