public class CheckPokerHands {

    // which accepts an array of cards as its only parameter and determines whether or 
    //   not the array of Cards represents a Royal Flush
    public static boolean isRoyalFlush(Card[] hand){
        return false;
    } 

    public static boolean isStraightFlush(Card[] hand){
        return false;
    }

    public static boolean isFlush(Card[] hand){
        int s = hand[0].getSuit();
        for(int i =0; i<hand.length; i++){
            if (hand[i].getSuit() != s)
                return false;
        }
        return true;
    }

    public static boolean isFullHouse(Card[] hand){

        return false;
    }
    
    public static Card highCard(Card[] hand){
        int highValue = -1;
        Card result = null;
        for(int i = 0; i < hand.length; i++){
            if(hand[i].getRank() == Card.ACE){
                return hand[i];
            }

            if (hand[i].getRank() > highValue){
                highValue = hand[i].getRank();
                result = hand[i];
            }
        }
        return result;
    }
}