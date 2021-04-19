package myobj.game.poker;

import java.util.ArrayList;

public class player {
	
	ArrayList<Card> hand;
	
	public player() {
		hand = new ArrayList<>();
		
	}
	
	public void firstDraw(Deck deck) {
		hand.add(deck.draw());
		hand.add(deck.draw());
	}

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		new player();
		
		
		
	}
}
