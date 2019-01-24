
import java.util.Arrays;

public class ChangeArrays {


    public static void main(String[] args){
        /*
            Write a program to add a score of 100 to 
            the the array scores.
        */
        
        int[] scores = {88,91,80,78,95};

        System.out.println("Current scores are: " + Arrays.toString(scores));

        //TODO 1: Write code to make a new array that can hold a new score
        int[] temp = new int[scores.length + 1];
        for(int i = 0; i<scores.length; i++){
            temp[i] = scores[i];
        }
        temp[temp.length -1] = 100;
        scores = temp;


        // ... code to add should stay above this line
        System.out.println("After 'adding' score: " + Arrays.toString(scores));



        //TODO 2: Next, write code to remove the first value from the scores
        int[] temp2 = new int[scores.length -1];
        for(int i = 1; i < scores.length; i++){
            temp2[i-1] = scores[i];
        }

        // ... code to remove should stay above this line
        System.out.println("After 'remove' scores are: " + Arrays.toString(scores));


        //TODO 3: Implement the methods below
        int[] arr2 = makeCopyOf(scores);
        //System.out.println("Copy of scores looks like: " + scores);
    }

    /*
        int[] first_arr = {5, 6, 7 ,8}
        int[] second_arr = makeCopyOf(first_arr)
        //second_arr should also have 5,6, 7, 8
        //furthermore,
        second_arr[1] = 12; //Should not change first_arr
        print(first_arr) -> {5, 6, 7 ,8}
        print(second_arr) -> {5, 12, 7 ,8}
    */
    public static int[] makeCopyOf(int[] arr){
        return null;
    }

    /*
        int[] arr = { 5, 6, 7 ,8 }
        arr = addValueAt( arr, -9, 3)
        // { 5, 6, 7, -9, 8}
    */
    public static int[] addValueAt(int[] arr, int val, int indexAt){
        return null;
    }

   /*
        int[] arr = { 5, 6, 7 ,8 }
        arr = removeLast( arr)
        // arr should look like { 5, 6, 7}
    */
    public static int[] removeLast(int[] arr){        
        return null;
    }

   /*
        int[] arr = { 5, 6, 7 ,8 }
        arr = removeIndex(arr, 1)
        //arr should look like { 5, 7, 8 }
    */
    public static int[] removeIndex(int[] arr, int index){
        return null;
    }
}