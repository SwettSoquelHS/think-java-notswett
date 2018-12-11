public class GoFish { 
    
    public static void main(String[] args){

    	Card clubs8 = new Card(8, Card.CLUBS );

    	System.out.println("The card in my hand is: " + clubs8);

    	Card heartsQueen = new Card(12, Card.HEARTS);
    	System.out.println("Second card is " + heartsQueen);


    	Deck theDeck = new Deck();
    	System.out.println("Top card is: " + theDeck.topCard());
    	theDeck.shuffle();
    	System.out.println("Top card after shuffle: " + theDeck.topCard());
        System.out.println("\n\n");

    	Card[] aHand = theDeck.dealHand(5);
    	for(Card c: aHand){
    		System.out.println("Card is: " + c);
    	}

        Deck.sortHand(aHand);
        System.out.println("After sort....");
        for(Card c: aHand){
            System.out.println("Card is: " + c);
        }

    }
}