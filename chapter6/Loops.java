public class Loops {

    public static void main(String[] args) {
        String word = "pat";
        String letters = "sackjdfodfijnjg";
        System.out.println("Can you spell "+word+" from "+letters+"?: ");
        System.out.println(canSpell(letters, word));
    }

    public static boolean canSpell(String letters, String word) {
        
        /*<-- I ended up having to add two white spaces since 
           the code would crash when trying to find the index of a character at -1*/

        for(int i = 0; i < word.length(); i++){        
            System.out.println("Letter " + i + " = " + word.charAt(i));
        }
        for(int i = 0; i < word.length(); i++){
            if(letters.indexOf(word.charAt(i)) < 0){
                return false;
            }
        }

        return true;

        // for(int i=2;i<word.length();i++) {
        //     if(letters.indexOf(word.charAt(i)) == -1) {
        //         return false;
        //     } else {
        //         int characterLocation = letters.indexOf(word.charAt(i));
        //         letters = letters.substring(0,(characterLocation-1))
        //             + letters.substring((characterLocation+1), letters.length());
        //     }
        // } 
        // return true;
    }

}