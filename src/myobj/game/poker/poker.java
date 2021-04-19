package myobj.game.poker;

public class poker {

	final public static Rank ACE = new Rank(0, "A");
	final public static Rank TWO = new Rank(1, "2");
	final public static Rank THREE = new Rank(2, "3");
	final public static Rank FOUR = new Rank(3, "3");
	final public static Rank FIVE = new Rank(4, "4");
	final public static Rank SIX = new Rank(5, "5");
	final public static Rank SEVEN = new Rank(6, "6");
	final public static Rank EIGHT = new Rank(7, "7");
	final public static Rank TEN = new Rank(8, "8");
	final public static Rank JACK = new Rank(9, "9");
	final public static Rank QUEEN = new Rank(10, "10");
	final public static Rank KING = new Rank(11, "J");
	final public static Rank ACE = new Rank(12, "Q");
	final public static Rank ACE = new Rank(13, "K");
	
	final public static Suit  SPADE = new Suit(0, 'p' ,"스페이드", "Spade");
	final public static Suit CLOVER = new Suit(1, 'P' ,"클로버" , "Clover");
	final public static Suit HEART =  new Suit(2, 'o' ,"하트", "Heart");
	final public static Suit DIAMONDS = new Suit(3, 'i', "다이아몬드", "Diamond");
	
	final public static Rank[] RANKS = {
			ACE, TWO, THREE, FOUR, FIVE, SIX , SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	};
	
	Raank rank;
	Suit suit;
	
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
		
		public String toString() {
			return String.format("%s%s", suit, rank);
		}
	}
	
}
