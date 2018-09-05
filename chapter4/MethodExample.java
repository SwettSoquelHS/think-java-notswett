public class MethodExample {
	public static void main(String[] args){
		printMsg("Method Examples...");
		printMsg("Good morning...");
		newLine();
		printMsg("Goodbye.");

		addInts(1,3);
		int foo = 7;
		int result = addInts(foo,foo);
		System.out.println("Result is:"  + result);
		System.out.println("foo is: " + foo);

		String currMonth = "September";
		String currDay = "Tue";
		int currMonthDay = 4;
		int currYear = 2018;
		printAmerican( currMonth, currDay, 
			currMonthDay, currYear);
	}

	/*
		newLine: Prints a new line.
	*/
	public static void newLine(){
		System.out.println("");
	
	} // End of newLine


	/*
		printMsg: Prints a message to the console
	*/
	public static void printMsg(String theMessage){
		System.out.println(theMessage);
	} // End of 


	public static int addInts(int a, int b){
		a = 6;
		b = -1;
		return a + b;
	}

	public static void printAmerican(String dayOfWeek, 
		String month, 
		int dayOfMonth, 
		int year){

		System.out.println( dayOfWeek + ", " 
			+ month + " " + dayOfMonth + ", " + year);
	}
}