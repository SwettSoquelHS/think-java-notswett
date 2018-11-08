/*
	Class to model a play card from
	a standard 52 deck of playing cards.
*/
public class Card {

	public static final int HEARTS 		= 1;
	public static final int CLUBS 		= 2;
	public static final int DIAMONDS 	= 3;
	public static final int SPADES 		= 4;

	private int rank;
	private int suit;

	private static final String[] SUITES =
		{null, "Hearts", "Clubs", "Diamonds", "Spades"};

	private static final String[] RANKS = 
		{null, "Ace", "2", "3", "4", "5", "6", "7", 
		  "8",   "9", "10", "Jack", "Queen", "King"};


	public Card(int rank, int suit){
		this.rank = rank;
		this.suit = suit;
	}

    public String toString(){
    	return RANKS[rank] + " of " +  SUITES[suit];
    }

    public boolean equals(Card otherCard){
    	return this.rank == otherCard.rank
    		&& this.suit == otherCard.suit;
    }	
}