/*
	Class to model a play card from
	a standard 52 deck of playing cards.
*/
public class Card {
    //Static Variables
    //Suit constants
	public static final int HEARTS 		= 1;
	public static final int CLUBS 		= 2;
	public static final int DIAMONDS 	= 3;
	public static final int SPADES 		= 4;

    //Rank constants for Face Cards
    public static final int ACE          =  1;
    public static final int JACK         =  10;
    public static final int QUEEN        =  11;
    public static final int KING         =  12;

    //String representations of Suite and Rank
	private static final String[] SUITES =
		{null, "Hearts", "Clubs", "Diamonds", "Spades"};

	private static final String[] RANKS = 
		{null, "Ace", "2", "3", "4", "5", "6", "7", 
		  "8",   "9", "10", "Jack", "Queen", "King"};

    //These public static variables
    // are useful to loop over hearts, or/and ranks
    public static final int[] CARD_SUITES = {HEARTS, CLUBS, DIAMONDS, SPADES};
    public static final int[] CARD_RANKS =  {2,3,4,5,6,7,8,9,10,JACK, QUEEN, KING, ACE};

    private int rank;
    private int suit;


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

    public int getRank(){
        return rank;
    }

    public int getSuit(){
        return suit;
    }
}