public class FarmDog extends FarmAnimal {
	
	public FarmDog(String name){
		//Need to call super constructor
		super(name);
	}

	public void makeSound(){
		System.out.println("Have you read todays times article.");
	}

	public void feedMe(){
		super.feedMe();
		System.out.println(">wags tail<");
	}

}