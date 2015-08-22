package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ProbilityTable {

	// public static HashMap<String, Integer> probilityTable = new
	// HashMap<String, Integer>();
	// public static HashMap<String, Integer> probilityTable = new
	// HashMap<String, Integer>();
	// public static HashMap<String, Integer> probilityTable = new
	// HashMap<String, Integer>();
	// public static HashMap<String, Integer> flushTable = new HashMap<String,
	// Integer>();
	// public static HashMap<String, Integer> straightTable = new
	// HashMap<String, Integer>();
	// public static HashMap<String, Integer> threeTable = new HashMap<String,
	// Integer>();
	// public static HashMap<String, Integer> twoTable = new HashMap<String,
	// Integer>();
	// public static HashMap<String, Integer> oneTable = new HashMap<String,
	// Integer>();
	// public static HashMap<String, Integer> commonTable = new HashMap<String,
	// Integer>();
	public static HashMap<String, Integer> probilityTable = new HashMap<String, Integer>();

	public ProbilityTable() {
		// TODO Auto-generated constructor stub

		probilityTable.put("1413121110", 1);
		probilityTable.put("131211109", 2);
		probilityTable.put("12111098", 3);
		probilityTable.put("1110987", 4);
		probilityTable.put("109876", 5);
		probilityTable.put("98765", 6);
		probilityTable.put("87654", 7);
		probilityTable.put("76543", 8);
		probilityTable.put("65432", 9);
		probilityTable.put("54321", 10);

		probilityTable.put("1414141413", 11);
		probilityTable.put("1414141412", 12);
		probilityTable.put("1414141411", 13);
		probilityTable.put("1414141410", 14);
		probilityTable.put("141414149", 15);
		probilityTable.put("141414148", 16);
		probilityTable.put("141414147", 17);
		probilityTable.put("141414146", 18);
		probilityTable.put("141414145", 19);
		probilityTable.put("141414144", 20);
		probilityTable.put("141414143", 21);
		probilityTable.put("141414142", 22);

		probilityTable.put("1313131314", 23);
		probilityTable.put("1313131312", 24);
		probilityTable.put("1313131311", 25);
		probilityTable.put("1313131310", 26);
		probilityTable.put("131313139", 27);
		probilityTable.put("131313138", 28);
		probilityTable.put("131313137", 29);
		probilityTable.put("131313136", 30);
		probilityTable.put("131313135", 31);
		probilityTable.put("131313134", 32);
		probilityTable.put("131313133", 33);
		probilityTable.put("131313132", 34);

		probilityTable.put("1212121214", 35);
		probilityTable.put("1212121213", 36);
		probilityTable.put("1212121211", 37);
		probilityTable.put("1212121210", 38);
		probilityTable.put("121212129", 39);
		probilityTable.put("121212128", 40);
		probilityTable.put("121212127", 41);
		probilityTable.put("121212126", 42);
		probilityTable.put("121212125", 43);
		probilityTable.put("121212124", 44);
		probilityTable.put("121212123", 45);
		probilityTable.put("121212122", 46);

		probilityTable.put("1111111114", 47);
		probilityTable.put("1111111113", 48);
		probilityTable.put("1111111112", 49);
		probilityTable.put("1111111110", 50);
		probilityTable.put("111111119", 51);
		probilityTable.put("111111118", 52);
		probilityTable.put("111111117", 53);
		probilityTable.put("111111116", 54);
		probilityTable.put("111111115", 55);
		probilityTable.put("111111114", 56);
		probilityTable.put("111111113", 57);
		probilityTable.put("111111112", 58);

		probilityTable.put("1010101014", 59);
		probilityTable.put("1010101013", 60);
		probilityTable.put("1010101012", 61);
		probilityTable.put("1010101011", 62);
		probilityTable.put("101010109", 63);
		probilityTable.put("101010108", 64);
		probilityTable.put("101010107", 65);
		probilityTable.put("101010106", 66);
		probilityTable.put("101010105", 67);
		probilityTable.put("101010104", 68);
		probilityTable.put("101010103", 69);
		probilityTable.put("101010102", 70);

		probilityTable.put("999914", 71);
		probilityTable.put("999913", 72);
		probilityTable.put("999912", 73);
		probilityTable.put("999911", 74);
		probilityTable.put("999910", 75);
		probilityTable.put("99998", 76);
		probilityTable.put("99997", 77);
		probilityTable.put("99996", 78);
		probilityTable.put("99995", 79);
		probilityTable.put("99994", 80);
		probilityTable.put("99993", 81);
		probilityTable.put("99992", 82);

		probilityTable.put("888814", 83);
		probilityTable.put("888813", 84);
		probilityTable.put("888812", 85);
		probilityTable.put("888811", 86);
		probilityTable.put("888810", 87);
		probilityTable.put("88889", 88);
		probilityTable.put("88887", 89);
		probilityTable.put("88886", 90);
		probilityTable.put("88885", 91);
		probilityTable.put("88884", 92);
		probilityTable.put("88883", 93);
		probilityTable.put("88882", 94);

		probilityTable.put("777714", 95);
		probilityTable.put("777713", 96);
		probilityTable.put("777712", 97);
		probilityTable.put("777711", 98);
		probilityTable.put("777710", 99);
		probilityTable.put("77779", 100);
		probilityTable.put("77778", 101);
		probilityTable.put("77776", 102);
		probilityTable.put("77775", 103);
		probilityTable.put("77774", 104);
		probilityTable.put("77773", 105);
		probilityTable.put("77772", 106);

		probilityTable.put("666614", 107);
		probilityTable.put("666613", 108);
		probilityTable.put("666612", 109);
		probilityTable.put("666611", 110);
		probilityTable.put("666610", 111);
		probilityTable.put("66669", 112);
		probilityTable.put("66668", 113);
		probilityTable.put("66667", 114);
		probilityTable.put("66665", 115);
		probilityTable.put("66664", 116);
		probilityTable.put("66663", 117);
		probilityTable.put("66662", 118);

		probilityTable.put("555514", 119);
		probilityTable.put("555513", 120);
		probilityTable.put("555512", 121);
		probilityTable.put("555511", 122);
		probilityTable.put("555510", 123);
		probilityTable.put("55559", 124);
		probilityTable.put("55558", 125);
		probilityTable.put("55557", 126);
		probilityTable.put("55556", 127);
		probilityTable.put("55554", 128);
		probilityTable.put("55553", 129);
		probilityTable.put("55552", 130);

		probilityTable.put("444414", 131);
		probilityTable.put("444413", 132);
		probilityTable.put("444412", 133);
		probilityTable.put("444411", 134);
		probilityTable.put("444410", 135);
		probilityTable.put("44449", 136);
		probilityTable.put("44448", 137);
		probilityTable.put("44447", 138);
		probilityTable.put("44446", 139);
		probilityTable.put("44445", 140);
		probilityTable.put("44443", 141);
		probilityTable.put("44442", 142);

		probilityTable.put("333314", 143);
		probilityTable.put("333313", 144);
		probilityTable.put("333312", 145);
		probilityTable.put("333311", 146);
		probilityTable.put("333310", 147);
		probilityTable.put("33339", 148);
		probilityTable.put("33338", 149);
		probilityTable.put("33337", 150);
		probilityTable.put("33336", 151);
		probilityTable.put("33335", 152);
		probilityTable.put("33334", 153);
		probilityTable.put("33332", 154);

		probilityTable.put("222214", 155);
		probilityTable.put("222213", 156);
		probilityTable.put("222212", 157);
		probilityTable.put("222211", 158);
		probilityTable.put("222210", 159);
		probilityTable.put("22229", 160);
		probilityTable.put("22228", 161);
		probilityTable.put("22227", 162);
		probilityTable.put("22226", 163);
		probilityTable.put("22225", 164);
		probilityTable.put("22224", 165);
		probilityTable.put("22223", 166);

		probilityTable.put("1414141313", 167);
		probilityTable.put("1414141212", 168);
		probilityTable.put("1414141111", 169);
		probilityTable.put("1414141010", 170);
		probilityTable.put("14141499", 171);
		probilityTable.put("14141488", 172);
		probilityTable.put("14141477", 173);
		probilityTable.put("14141466", 174);
		probilityTable.put("14141455", 175);
		probilityTable.put("14141444", 176);
		probilityTable.put("14141433", 177);
		probilityTable.put("14141422", 178);

		probilityTable.put("1313131414", 179);
		probilityTable.put("1313131212", 180);
		probilityTable.put("1313131111", 181);
		probilityTable.put("1313131010", 182);
		probilityTable.put("13131399", 183);
		probilityTable.put("13131388", 184);
		probilityTable.put("13131377", 185);
		probilityTable.put("13131366", 186);
		probilityTable.put("13131355", 187);
		probilityTable.put("13131344", 188);
		probilityTable.put("13131333", 189);
		probilityTable.put("13131322", 190);

		probilityTable.put("1212121414", 191);
		probilityTable.put("1212121313", 192);
		probilityTable.put("1212121111", 193);
		probilityTable.put("1212121010", 194);
		probilityTable.put("12121299", 195);
		probilityTable.put("12121288", 196);
		probilityTable.put("12121277", 197);
		probilityTable.put("12121266", 198);
		probilityTable.put("12121255", 199);
		probilityTable.put("12121244", 200);
		probilityTable.put("12121233", 201);
		probilityTable.put("12121222", 202);

		probilityTable.put("1111111414", 203);
		probilityTable.put("1111111313", 204);
		probilityTable.put("1111111212", 205);
		probilityTable.put("1111111010", 206);
		probilityTable.put("11111199", 207);
		probilityTable.put("11111188", 208);
		probilityTable.put("11111177", 209);
		probilityTable.put("11111166", 210);
		probilityTable.put("11111155", 211);
		probilityTable.put("11111144", 212);
		probilityTable.put("11111133", 213);
		probilityTable.put("11111122", 214);

		probilityTable.put("1010101414", 215);
		probilityTable.put("1010101313", 216);
		probilityTable.put("1010101212", 217);
		probilityTable.put("1010101111", 218);
		probilityTable.put("10101099", 219);
		probilityTable.put("10101088", 220);
		probilityTable.put("10101077", 221);
		probilityTable.put("10101066", 222);
		probilityTable.put("10101055", 223);
		probilityTable.put("10101044", 224);
		probilityTable.put("10101033", 225);
		probilityTable.put("10101022", 226);

		probilityTable.put("9991414", 227);
		probilityTable.put("9991313", 228);
		probilityTable.put("9991212", 229);
		probilityTable.put("9991111", 230);
		probilityTable.put("9991010", 231);
		probilityTable.put("99988", 232);
		probilityTable.put("99977", 233);
		probilityTable.put("99966", 234);
		probilityTable.put("99955", 235);
		probilityTable.put("99944", 236);
		probilityTable.put("99933", 237);
		probilityTable.put("99922", 238);

		probilityTable.put("8881414", 239);
		probilityTable.put("8881313", 240);
		probilityTable.put("8881212", 241);
		probilityTable.put("8881111", 242);
		probilityTable.put("8881010", 243);
		probilityTable.put("88899", 244);
		probilityTable.put("88877", 245);
		probilityTable.put("88866", 246);
		probilityTable.put("88855", 247);
		probilityTable.put("88844", 248);
		probilityTable.put("88833", 249);
		probilityTable.put("88822", 250);

		probilityTable.put("7771414", 251);
		probilityTable.put("7771313", 252);
		probilityTable.put("7771212", 253);
		probilityTable.put("7771111", 254);
		probilityTable.put("7771010", 255);
		probilityTable.put("77799", 256);
		probilityTable.put("77788", 257);
		probilityTable.put("77766", 258);
		probilityTable.put("77755", 259);
		probilityTable.put("77744", 260);
		probilityTable.put("77733", 261);
		probilityTable.put("77722", 262);

		probilityTable.put("6661414", 263);
		probilityTable.put("6661313", 264);
		probilityTable.put("6661212", 265);
		probilityTable.put("6661111", 266);
		probilityTable.put("6661010", 267);
		probilityTable.put("66699", 268);
		probilityTable.put("66688", 269);
		probilityTable.put("66677", 270);
		probilityTable.put("66655", 271);
		probilityTable.put("66644", 272);
		probilityTable.put("66633", 273);
		probilityTable.put("66622", 274);

		probilityTable.put("5551414", 275);
		probilityTable.put("5551313", 276);
		probilityTable.put("5551212", 276);
		probilityTable.put("5551111", 277);
		probilityTable.put("5551010", 278);
		probilityTable.put("55599", 279);
		probilityTable.put("55588", 280);
		probilityTable.put("55577", 281);
		probilityTable.put("55566", 282);
		probilityTable.put("55544", 283);
		probilityTable.put("55533", 284);
		probilityTable.put("55522", 285);

		probilityTable.put("4441414", 286);
		probilityTable.put("4441313", 287);
		probilityTable.put("4441212", 288);
		probilityTable.put("4441111", 289);
		probilityTable.put("4441010", 290);
		probilityTable.put("44499", 291);
		probilityTable.put("44488", 292);
		probilityTable.put("44477", 293);
		probilityTable.put("44466", 294);
		probilityTable.put("44455", 295);
		probilityTable.put("44433", 296);
		probilityTable.put("44422", 297);

		probilityTable.put("3331414", 298);
		probilityTable.put("3331313", 299);
		probilityTable.put("3331212", 300);
		probilityTable.put("3331111", 301);
		probilityTable.put("3331010", 302);
		probilityTable.put("33399", 303);
		probilityTable.put("33388", 304);
		probilityTable.put("33377", 305);
		probilityTable.put("33366", 306);
		probilityTable.put("33355", 307);
		probilityTable.put("33344", 308);
		probilityTable.put("33322", 309);

		probilityTable.put("2221414", 310);
		probilityTable.put("2221313", 311);
		probilityTable.put("2221212", 312);
		probilityTable.put("2221111", 313);
		probilityTable.put("2221010", 314);
		probilityTable.put("22299", 315);
		probilityTable.put("22288", 316);
		probilityTable.put("22277", 317);
		probilityTable.put("22266", 318);
		probilityTable.put("22255", 319);
		probilityTable.put("22244", 320);
		probilityTable.put("22233", 321);
	}

	public int getProbilityTabl(String card) {
		return probilityTable.get(card);
	}

	public void calculateProbility() {

		ArrayList<Card> flopCards = Competition.getInstance().getFlopCards();
		int[] cardNum = new int[5];

		cardNum[0] = flopCards.get(0).getPoint();
		cardNum[1] = flopCards.get(1).getPoint();
		cardNum[2] = flopCards.get(2).getPoint();

		for (int i = 2; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				cardNum[3] = i;
				cardNum[4] = j;
				Arrays.sort(cardNum);
				getProbilityTabl(String.valueOf(cardNum[0])
						+ String.valueOf(cardNum[1])
						+ String.valueOf(cardNum[2])
						+ String.valueOf(cardNum[3])
						+ String.valueOf(cardNum[4]));
			}
		}

	}
}
