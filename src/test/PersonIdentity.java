package test;

public class PersonIdentity {
	public static Person person1;
	public static Person person2;
	public static Person person3;
	public static Person person4;
	public static Person person5;
	public static Person person6;
	public static Person person7;
	public static Person person8;

	public static void getPerson() {
		if (Game.player.getStation() != 0) {
			person1 = Game.personHashMap.get(Game.personStationHashMap.get(1));
		} else {
			person1 = Game.player;
		}

		if (Game.player.getStation() != 1) {
			person2 = Game.personHashMap.get(Game.personStationHashMap.get(2));
		} else {
			person2 = Game.player;
		}

		if (Game.player.getStation() != 2) {
			person3 = Game.personHashMap.get(Game.personStationHashMap.get(3));
		} else {
			person3 = Game.player;
		}

		if (Game.player.getStation() != 3) {
			person4 = Game.personHashMap.get(Game.personStationHashMap.get(4));
		} else {
			person4 = Game.player;
		}

		if (Game.player.getStation() != 4) {
			person5 = Game.personHashMap.get(Game.personStationHashMap.get(5));
		} else {
			person5 = Game.player;
		}

		if (Game.player.getStation() != 5) {
			person6 = Game.personHashMap.get(Game.personStationHashMap.get(6));
		} else {
			person6 = Game.player;
		}

		if (Game.player.getStation() != 6) {
			person7 = Game.personHashMap.get(Game.personStationHashMap.get(7));
		} else {
			person7 = Game.player;
		}

		if (Game.player.getStation() != 7) {
			person8 = Game.personHashMap.get(Game.personStationHashMap.get(8));
		} else {
			person8 = Game.player;
		}

	}
}
