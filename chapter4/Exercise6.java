public class Exercise6 {

	/*
	Main prog entry point.
	*/
	public static void main(String[] args){
		System.out.println("Exercise 6...");

		System.out.println("multAdd( 5,6,7) = " + 
			multAdd(5.0,6.0,7.0));

		double sin_pi_over_4 = 
			Math.sin(Math.PI/4.0);
		double cos_pi_over_4 = 
			Math.cos(Math.PI/4);
		double result = multAdd(0.5, 
			cos_pi_over_4, sin_pi_over_4);
		System.out.println("multAdd( )=" + result);

		System.out.println("expSum(3)=" + expSum(3));
		System.out.println("expSum(0)=" + expSum(0));
	}

	/*
	   multAdd: Returns the product of a, b added to c.
	*/
	public static double multAdd(double a, double b, double c){
		return a*b + c;
	}

	/*
	  expSum: Returns x*e^-x - (1-e^-x)^0.5
	*/
	public static double expSum(double x){
		double eToX = Math.exp(-1.0*x);
		double sqrt = Math.sqrt(1 - eToX);
		return multAdd(x,eToX, sqrt);
	}


}
