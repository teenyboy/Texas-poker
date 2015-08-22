package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		//
		// int test = 0;
		// int maxtest = -1;
		//
		// Map<String, Integer> contextMap = new HashMap<String, Integer>();
		//
		// contextMap.put("1313", 1313);
		// contextMap.put("1414", 1414);
		// System.out.println(contextMap.get("1212"));

		String msg = "game-over \r\n";
		if (msg.subSequence(0, 9).equals("game-over")) {
			System.out.println(msg.subSequence(0, 9));
		}

		// getTwoCore();

	}

	private static void getFiveCore() {
		Card card1 = new Card();
		card1.setColor("SPADES");
		card1.setPoint("J");

		Card card2 = new Card();
		card2.setColor("SPADES");
		card2.setPoint("J");

		Card card3 = new Card();
		card3.setColor("SPADES");
		card3.setPoint("9");

		Card card4 = new Card();
		card4.setColor("CLUBS");
		card4.setPoint("4");

		Card card5 = new Card();
		card5.setColor("HEARTS");
		card5.setPoint("5");

		ArrayList<Card> test = new ArrayList<Card>();

		test.add(card1);
		test.add(card2);
		test.add(card3);
		test.add(card4);
		test.add(card5);

		CardJudge cardJudge = new CardJudge();
		// System.out.println(cardJudge.setCardJudge(test));
	}

	private static void getTwoCore() {
		TwoCore wCore = new TwoCore();
		System.out.println(wCore.getCardAbility());
	}

	private static void calculateFive() {

		int cardJudge = 0;

		int[] cardPoint = { 14, 13, 12, 11, 7 };
		int[] cardColor = { 1, 1, 1, 1, 1 };

		int[] cardPointNum = new int[5];

		// ArrayList<Integer> cardPoint = new ArrayList<Integer>();
		// ArrayList<Integer> cardColor = new ArrayList<Integer>();

		Arrays.sort(cardPoint);

		if (cardPoint[4] == 14) {
			cardPointNum[0] = 1;
			cardPointNum[1] = cardPoint[0];
			cardPointNum[2] = cardPoint[1];
			cardPointNum[3] = cardPoint[2];
			cardPointNum[4] = cardPoint[3];
		}

		CardSequence cardSequence = new CardSequence();

		// if (cardColor[0] == cardColor[1] && cardColor[1] == cardColor[2]
		// && cardColor[2] == cardColor[3] && cardColor[3] == cardColor[4]) {
		// if ((cardPoint[0] + 1 == cardPoint[1]
		// && cardPoint[1] + 1 == cardPoint[2]
		// && cardPoint[2] + 1 == cardPoint[3] && cardPoint[3] + 1 ==
		// cardPoint[4])
		// || (cardPointNum[0] + 1 == cardPointNum[1]
		// && cardPointNum[1] + 1 == cardPointNum[2]
		// && cardPointNum[2] + 1 == cardPointNum[3] && cardPointNum[3] + 1 ==
		// cardPointNum[4])) {
		//
		// cardSequence.setCardAbility(0);
		// // A2345
		// if (cardPointNum[0] + 1 == cardPointNum[1]) {
		// cardSequence.setCardNum(10);
		// }
		// // 同花顺筛选
		// cardSequence.setCardNum(cardSequence
		// .getStraightFlush(cardPoint));
		// } else {

		int[] a = new int[cardPoint[0] - 1];
		for (int i = 2; i <= cardPoint[0]; i++) {
			a[i - 2] = i - 1;
		}

		int[] b = new int[cardPoint[1] - 2];
		b[0] = a[0];
		for (int j = 4; j <= cardPoint[1]; j++) {
			if (j <= cardPoint[0]) {
				b[j - 3] = b[j - 4] + a[j - 3];
			} else {
				if (cardPoint[0] == 2) {
					b[j - 3] = (j - cardPoint[0]) * a[cardPoint[0] - 2];
				} else {
					b[j - 3] = b[cardPoint[0] - 3] + (j - cardPoint[0])
							* a[cardPoint[0] - 2];
				}
			}
		}

		int[] c = new int[cardPoint[2] - 3];
		c[0] = b[0];
		for (int m = 5; m <= cardPoint[2]; m++) {
			if (m <= cardPoint[1]) {
				c[m - 4] = c[m - 5] + b[m - 4];
			} else {
				if (cardPoint[1] == 3) {
					c[m - 4] = (m - cardPoint[1]) * b[cardPoint[1] - 3];
				} else {
					c[m - 4] = c[cardPoint[1] - 4] + (m - cardPoint[1])
							* b[cardPoint[1] - 3];
				}
			}
		}

		int[] d = new int[cardPoint[3] - 4];
		d[0] = c[0];
		for (int n = 6; n <= cardPoint[3]; n++) {
			if (n <= cardPoint[2]) {
				d[n - 5] = d[n - 6] + c[n - 5];
			} else {
				if (cardPoint[2] == 4) {
					d[n - 5] = (n - cardPoint[2]) * c[cardPoint[2] - 4];
				} else {
					d[n - 5] = d[cardPoint[2] - 5] + (n - cardPoint[2])
							* c[cardPoint[2] - 4];
				}
			}
		}

		int[] e = new int[cardPoint[4] - 5];
		e[0] = d[0];
		for (int n = 7; n <= cardPoint[4]; n++) {
			if (n <= cardPoint[3]) {
				e[n - 6] = e[n - 7] + d[n - 6];
			} else {
				if (cardPoint[3] == 5) {
					e[n - 6] = (n - cardPoint[3]) * d[cardPoint[3] - 5];
				} else {
					e[n - 6] = e[cardPoint[3] - 6] + (n - cardPoint[3])
							* d[cardPoint[3] - 5];
				}
			}
		}

		int[] aa = new int[10 - cardPoint[0] - 1];
		for (int i = cardPoint[0]; i < 9; i++) {
			aa[9 - i - 1] = 9 - i;
		}

		int[] bb = new int[cardPoint[1] - cardPoint[0] - 2];
		for (int i = cardPoint[1] - 1; i > cardPoint[0] + 1; i--) {
			int num = 0;
			for (int j = i - cardPoint[0] - 2; j >= 0; j--) {
				num = num + aa[j];
			}
			bb[i - cardPoint[0] - 2] = num;
		}

		int[] cc = new int[cardPoint[2] - cardPoint[0] - 3];
		for (int i = cardPoint[2] - 1; i > cardPoint[0] + 2; i--) {
			int num = 0;
			for (int j = i - cardPoint[0] - 3; j >= 0; j--) {
				num = num + bb[j];
			}
			cc[i - cardPoint[0] - 3] = num;
		}

		int[] dd = new int[cardPoint[3] - cardPoint[0] - 4];
		for (int i = cardPoint[3] - 1; i > cardPoint[0] + 3; i--) {
			int num = 0;
			for (int j = i - cardPoint[0] - 4; j >= 0; j--) {
				num = num + cc[j];
			}
			dd[i - cardPoint[0] - 4] = num;
		}

		int[] ee = new int[cardPoint[4] - cardPoint[0] - 5];
		for (int i = cardPoint[4] - 1; i > cardPoint[0] + 4; i--) {
			int num = 0;
			for (int j = i - cardPoint[0] - 5; j >= 0; j--) {
				num = num + dd[j];
			}
			ee[i - cardPoint[0] - 5] = num;
		}

		int sum = 1600 - e[cardPoint[4] - 6] + cardPoint[0];

		for (int i = 0; i < aa.length; i++) {
			sum = sum - bb[i] - cc[i] - dd[i] - ee[i];
		}

		System.out.println(sum);

		// }

		// }
		// System.out.println(cardSequence.getCardNum());
	}

	private static void calculateTwo() {
		int card1Point = 1;
		int card2Point = 5;

		int personBillNum;
		int max = 0;
		if (card1Point > card2Point) {
			max = card1Point;
		} else {
			max = card2Point;
		}

		// System.out.println(max);

		switch (max) {
		case 1:
			personBillNum = 10;
			break;
		case 13:
			personBillNum = 8;
			break;
		case 12:
			personBillNum = 7;
			break;
		case 11:
			personBillNum = 6;
			break;
		default:
			personBillNum = max / 2;
			break;
		}
		// 出现对子
		if (card1Point == card2Point) {
			personBillNum = personBillNum * 2;
			if (personBillNum < 5) {
				personBillNum = 5;
			}
		}
		// 同花色加2
		// if (card1Color == card2Color) {
		// personBillNum = personBillNum + 2;
		// }

		int cardDif = Math.abs(card1Point - card2Point);

		if (cardDif < 2) {

		} else if (cardDif == 2) {

		} else if (cardDif == 3) {
			personBillNum = personBillNum - 2;
		} else if (cardDif == 4) {
			personBillNum = personBillNum - 4;
		} else {
			personBillNum = personBillNum - 5;
		}

		if (card1Point < 12 && card2Point < 12 & cardDif < 3) {
			personBillNum = personBillNum + 1;
		}
		// System.out.println(personBillNum);
	}
}
