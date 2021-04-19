package myobj.game.poker;

import java.util.ArrayList;

public class Dealer {

	ArrayList<Card> table;
	
	public Card next() {
		
		public Dealer(Deck deck) {
			table = new ArrayList<>();
			this.deck = deck;
		}
		
		public Card next() {
			table.add(deck.draw());
		}
	}
}
