public class Deck {
    
	private Card[] theDeck;

	public Deck(){
		theDeck = new Card[52];		
		int currentCard = 0;
		for(int suit : Card.CARD_SUITES){
			for(int rank: Card.CARD_RANKS){
				theDeck[currentCard] = new Card(rank, suit);
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

	public Card[] dealHand(int size){
		if(size < 0 || size > theDeck.length)
			return null;

		Card[] result = new Card[size];
		for(int i = 0; i<size; i++){
			int deckIndex = 0;
			while( deckIndex < theDeck.length && theDeck[deckIndex] == null){
				deckIndex++;
			}
			
			result[i] = theDeck[deckIndex];
			theDeck[deckIndex] = null;
		}
		return result;
	}

	public Card topCard(){
		return theDeck[0];
	}

	public static void sortHand(Card[] hand){
		int cIndex = 0;
		while( cIndex < hand.length ){
			if (!bubbleUp(hand, cIndex)){
				cIndex++;
			}
		}
	}

	private static boolean bubbleUp(Card[] hand, int atIndex){
		boolean swapHappened = false;
		for(int i = atIndex; i < hand.length-1; i++){
			if (hand[i].getRank() > hand[i+1].getRank()){
				Card toRight = hand[i+1];
				hand[i+1] = hand[i];
				hand[i] = toRight;				
				swapHappened = true;
			}
		}
		return swapHappened;
	}

	


}





