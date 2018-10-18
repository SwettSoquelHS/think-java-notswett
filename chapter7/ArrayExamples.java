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
            System.out.println(c + " = " + Integer.valueOf(c));
        }

        //allocate space for 26 letters
        int[] letterCounts = new int[26];

        int[] a = new int[] {1,2,3,4};

        String s = "foobar";
        System.out.println(s.substring(2,4));
        char c = 'c';
        System.out.println(s + c);

        print("testing indexOf");
        print( s.indexOf('b') +"");

    }

    public static void print(String s){
        System.out.println(s);
    }
}