

public class Main {

	public static void main(String[] args) {

		System.out.println("there are 3 players");


		Deck deck = new Deck();
		deck.shuffle();

		for(Card c : deck.getCards()) {
			c.flip();
			System.out.println(c);
		}


	}


}
