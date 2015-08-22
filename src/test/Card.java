package test;

public class Card {

	CardState cardState = new CardState();

	private int color;
	private int point;

	public int getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = cardState.getCardColorState(color);
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = cardState.getCardPointState(point);
	}

}
