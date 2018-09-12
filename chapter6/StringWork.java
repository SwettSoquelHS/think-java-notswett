public class StringWork {

	public static void main(String[] args){
		System.out.println("String Examples...");
		LastIndexOfExample();


	}

	public static void LastIndexOfExample(){
		// Initialising String 
        String theString = new String("How to use lastIndexOf:"); 
        System.out.println("u's: U u more U"); 
  
        //This is case sensative search, so the last Capital U 
        // doesn't count
        // Starting at index 0, we find the last u at position 7
        int idx = theString.lastIndexOf('u');
        System.out.println("The last u was at position: " + idx);

        //If the character isn't found then -1 is return
        idx = theString.lastIndexOf('z');
        System.out.println("The last z was at position: " + idx);

        System.out.println("\n\nTrim Example:");
        trimExample();
	}

    public static void trimExample(){
        String str = "    [stuff to be trimmed]   ";
        //Before the trimming:
        System.out.println("{"+str+"} - original string before trim.");

        //notice that just calling trim() doesn't actually
        //change the value in str
        str.trim();
        System.out.println("{"+str+"} - should look the same.");

        //need to reassign to str for it take on the new value
        str = str.trim();
        System.out.println("{"+str+"} - should now be trimmed same.");
    }


}