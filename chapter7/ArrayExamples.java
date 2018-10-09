public class ArrayExamples {
    
    public static void main(String[] args){
        String iago = "And what's he then that says I play the villain?"
                    + "When this advice is free I give and honest."
                    + "How am I then a villain"
                    + "To counsel Cassio to this parallel course,"
                    + "Directly to his good?"
                    + "So will I turn her virtue into pitch,"
                    + "And out of her own goodness make the net"
                    + "That shall enmesh them all.";

        for(char c = 'a'; c <= 'z'; c++){
            //System.out.println(c + " = " + Integer.valueOf(c));
        }

        int[] letterCounts = new int[26];
        for(int i=0; i< letterCounts.length; i++){
            letterCounts[i] = 0; //Or some intial value
        }

        for(int i=0; i<iago.length(); i++ ){
            char currChar = iago.charAt(i);
            if( (currChar >= 97 && currChar <= 122) ||
                (currChar >= 65 && currChar <= 90)) {
                if(currChar <= 90)
                    currChar += 32;
                letterCounts[ currChar - 97]++;
            }  
        }

        for(int i= 0; i < letterCounts.length ; i++){
            char c = (char)(i + 97);
            System.out.println( c + " = " + letterCounts[i]);
        }

        int[] stuffs = new int[] {1,2,3,4,5};

    }
}