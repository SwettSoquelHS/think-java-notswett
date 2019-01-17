
import java.util.Arrays;

public class ChangeArrays {


    public static void main(String[] args){
        /*
            Write a program to add a score of 100 to 
            the the array scores.
        */
        
        int[] scores = {88,91,80,78,95};

        System.out.println("Current scores are: " + Arrays.toString(scores));

        //TODO 1: Write code to make a new array that can hold a new
        


        // ... code to add should stay above this line
        System.out.println("After 'adding' score: " + Arrays.toString(scores));



        //TODO 2: Next, write code to remove the first value from the scores


        // ... code to remove should stay above this line
        System.out.println("After 'remove' scores are: " + Arrays.toString(scores));


        //TODO 3: Implement the methods below
        int[] arr2 = makeCopyOf(scores);
        //System.out.println("Copy of scores looks like: " + scores);
    }


    public static int[] makeCopyOf(int[] arr){
        return null;
    }

    public static int[] addValue(int[] arr, int val){
        return null;
    }

    public static int[] removeLast(int[] arr){        
        return null;
    }

    public static int[] removeIndex(int[] arr, int index){
        return null;
    }
}