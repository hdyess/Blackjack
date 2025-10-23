import java.util.ArrayList;

public class Hand {

	private ArrayList<Card> cards;

	public Hand(){
		cards = new ArrayList<>();
	}

	// A Card is dealt to the Hand and the Hand is responsible
	// to store the card
	public void Deal(Card card){
		cards.add(card);
	}

	public int getSize(){
		return cards.size();
	}


	/* The Hand uses the methods of each card to determine
	the value of each card - and adds up all values

	not keeping because no check if card is flipped, so a face down card would be return
	its value but a face up card would not

	public int getValue(){
		int value = 0;
		for(Card card: cards){
			card.flip(); // turn the card over to see the value
			value += card.getPointValue();
			card.flip(); // hide the card again
		}
		return value;
	}*/


}// hand