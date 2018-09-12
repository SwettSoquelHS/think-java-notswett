public class StringWork {

	public static void main(String[] args){
		System.out.println("String Examples...");
		LastIndexOfExample();


	}

	public static void LastIndexOfExample(){
		// Initialising String 
        String Str = new String("How to use lastIndexOf us:"); 
  
        System.out.print("Found Last Index of u at : "); 
  
        // Last index of 'u' will print where u is found in str
        // prints 7
        System.out.println(Str.lastIndexOf('u')); 

	}


}