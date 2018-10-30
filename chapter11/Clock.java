public class Clock { 
    /*
        main(): Driver for the clock class
    */
    public static void main(String[] args){

        Clock c = new Clock();
        System.out.println(c);
    }

    //member variables (or properties)
    int hour;
    int min;
    int sec;


    /*
      Primary Clock constructor
    */
    // public Clock(int hour, int minutes, int seconds){
    //     this.hour = hour;        
    // }

    public String toString(){
        return  hour + ":" + min + ":" + sec;
    }
}