package test;

public class PlayerCore {

	private static Object object = new Object();
	int billNum = 0;
	int raise = 0;

	private static PlayerCore playerCore = null;

	private PlayerCore() {
		// TODO Auto-generated constructor stub
	}

	public static PlayerCore getInstance() {
		if (playerCore == null) {
			synchronized (object) {
				if (playerCore == null)
					playerCore = new PlayerCore();
			}
		}
		return playerCore;
	}

	public int getBillNum() {
		return billNum;
	}

	public void setBillNum(int billNum) {
		this.billNum = billNum;
	}

	public int getRaise() {
		return raise;
	}

	public void setRaise(int raise) {
		this.raise = raise;
	}

}
