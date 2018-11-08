public class Deck {
    
	private Card[] theDeck;

	public Deck(){
		theDeck = new Card[52];
		int[] suites = {Card.CLUBS, Card.SPADES, 
			Card.HEARTS, Card. DIAMONDS};
		int currentCard = 0;
		for(int i = 0; i < suites.length; i++){
			for(int j = 1; j <= 13; j++){
				theDeck[currentCard] = new Card(j, suites[i]);
				currentCard++;
			}
		}
	}

	public void shuffle(){
		for(int i = 0; i < theDeck.length; i++){
			Card current = theDeck[i];
			int swapPosition = (int)(52*Math.random());

			//I need to remember what was in swapPosition
			Card swapCard = theDeck[swapPosition];

			theDeck[swapPosition] = current;
			theDeck[i] = swapCard;
		}
	}

	public Card topCard(){
		return theDeck[0];
	}

}