public class ArrayTest {
    
    public static void main(String[] args){
        int[] someInts = new int[4];//{1,2,3,4};

        System.out.println(someInts);
        System.out.println(args);

        for(char c = '!'; c <= '-'; c++){
            System.out.println(c + " = " + Integer.valueOf(c));
        }
    }
}