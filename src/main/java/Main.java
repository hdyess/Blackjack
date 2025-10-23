

public class Main {

	public static void main(String[] args) {

		Deck deck = new Deck();
		deck.shuffle();

		for(Card c : deck.getCards()) {
			c.flip();
			System.out.println(c);
		}


	}


}
