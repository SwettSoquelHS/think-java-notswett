public class Exercise4 {
// A word is said to be “abecedarian” if the letters 
// in the word appear in alphabetical order. For example, 
// the following are all six-letter English abecedarian words:

// abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, 
// behint, beknow, bijoux, biopsy, cestuy, chintz, deflux, dehors, 
// dehort, deinos, diluvy, dimpsy

    public static void main(String[] args){
        System.out.println("isAbecedarian(abdest) = " + isAbecedarian("abdest"));
        System.out.println("isAbecedarian(bijoux) = " + isAbecedarian("bijoux"));
        System.out.println("isAbecedarian(deflux) = " + isAbecedarian("deflux"));
        System.out.println("isAbecedarian(diluvy) = " + isAbecedarian("diluvy"));

        System.out.println("isAbecedarian(flap) = " + isAbecedarian("flap"));        
        System.out.println("isAbecedarian(zing) = " + isAbecedarian("zing"));    
        System.out.println("isAbecedarian(loosen) = " + isAbecedarian("loosen"));
    }

// Write a method called isAbecedarian that takes a 
// String and returns a boolean indicating whether 
// the word is abecedarian.
    public static boolean isAbecedarian(String theStr){
        for(int i=0; i < theStr.length()-1;i++){
            char currLetter = theStr.charAt(i);
            char nextLetter = theStr.charAt(i+1);
            if (nextLetter < currLetter){
                return false;
            }
        }
        return true;
    }

}