package myobj.game.poker;

public class Suit {
	private int value;
	private char shape;
	private String KorName;
	
	public Suit(int value, char shape, int korName) {
		this.value = value;
		this.shape = this.shape;
		this.KorName = KorName;
	}
	
	public Suit(int i, char c, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public String getKorName() {
		return KorName;
	}
	public char getShape() {
		return shape;
	}
	public int getValue() {
		return value;
	}
	
	public String toString() {
		return Character.toString(shape);
		
	}
	
}
