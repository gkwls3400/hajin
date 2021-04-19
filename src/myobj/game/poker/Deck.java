package myobj.game.poker;

import java.util.LinkedList;

public class Deck {

	
	LinkList<Card> deck;
	
	public Deck() {
		deck = new LinekedList<>();
		
		for (Rank rank : Card.RANK) {
			for (Rank rank : Card.RANKS) {
				deck.add(new Card(suit, rank));
			}
		}
		System.out.println("카드 생성 완료");
		System.out.println(deck);
	}
	
	public static void main(String[] args) {
		new Deck();
	}
	

}
