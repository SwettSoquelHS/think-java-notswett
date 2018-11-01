public class Clock { 
    /*
        main(): Driver for the clock class.
    */
    public static void main(String[] args){

        int theHour = 11;
        int theMin = 0;
        int theSec = 30;
        Clock c = new Clock( theHour, theMin, theSec );
        System.out.println("Clock time is: " + c);

        c.setHour(5);
        System.out.println("Clock time is: " + c);

        c.setHour(2800);
        System.out.println("Clock time is: " + c);

        System.out.println("The hour is: " + c.getHour());
    }

    //Class member variables, or properties
    int hour;
    int min;
    int sec;

    /*
        Constructor for clock
        Parameters: hour, minutes, seconds
    */
    public Clock(int hour, int minutes, int seconds){
        this.hour = hour;
        this.min = minutes;
        sec = seconds;

    }

    public void setHour(int newHour){
        if( newHour >= 0 && newHour <=23)
            hour = newHour;
    }

    public int getHour(){
        return hour;
    }

    public String toString(){
        return hour + ":" + min + ":" + sec;
    }
   
}