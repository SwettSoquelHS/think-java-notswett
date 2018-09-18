public class TestingString {

    public static void main(String[] args){


        String aString = "Some string";
        int len = aString.length();
        for(int i=0; i < aString.length(); i++){
            char c = aString.charAt(i);
            System.out.println("charAt("+ i + ") = " + c + " and charAt(length - i)=" + aString.charAt(len - i-1));
        }

    }

    public static void foo(double d){
        System.out.println(d);
    }
}