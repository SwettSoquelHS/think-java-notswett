import java.util.List;
import java.util.ArrayList;


public class ListExamples {


    public static void main(String[] args){
        System.out.println("\n\nLists examples...");

        List<String> myPets = new ArrayList<String>();
        myPets.add("My dog ollie");
        myPets.add("My chicken fluffbomb");
        System.out.println(myPets);

        myPets.get(0);
        System.out.println(myPets);

        
        
        int[] scores = {88,91,80,78,95};

        System.out.println("\n");
    }



}