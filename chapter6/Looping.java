public class Looping {
	public static void main(String[] args){
		System.out.println("Loop master!");

		boolean flag = true;
		while( flag ){
			
			print("Flag: " + flag );
			flag = false;
		}

		for(int i=0; i<10; i++){
			print("I is: " + i);
			i = i*2;
		}

		for(int i=1; i<= 5; i++){
			for(int j=1; j<=5; j++){
				System.out.printf( "%4d",i*j);

			}
			System.out.println("");
		}

	}

	public static void print(String s){
		System.out.println(s);
	}

}