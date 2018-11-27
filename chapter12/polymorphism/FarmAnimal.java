
/*
	FarmAnimal is the base class (or super class)
	for all animals that can live on a farm.
*/
public class FarmAnimal {

	private String name;

	public FarmAnimal(String name){
		this.name = name;
	}

	public void makeSound(){
		System.out.println("I don't know what to say.");
	}

	public void feedMe(){
		System.out.println("I have been fed.");
	}

	public String whatAmI(){		
		return this.getClass().getName();
	}

	public String getName(){
		return name;
	}
	
}