package Platoon;

public class Card {

	private String type = "N/A";
	private int val = 0;

	public Card(String type, int val) {
		this.val = val;
		this.type = type;


	}

	public Card(int val) {
		this.val = val;
		this.type = "Pawn";
	}

	public Card(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return this.getType() + ":" + this.getVal();
	}
}
