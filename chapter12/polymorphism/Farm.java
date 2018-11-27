public class Farm {
    public static void main(String[] args){
        System.out.println("Welcome to the Mr. Swett's farm.");

        FarmAnimal animal = new FarmAnimal("Bessie");
        FarmCow cow = new FarmCow("Sandy");
        FarmChicken chicken = new FarmChicken("Mr. Waffles");
        FarmDog doge = new FarmDog("Ollie");
       

        FarmAnimal[] allTheAnimals = new FarmAnimal[10];
        allTheAnimals[0] = cow;
        allTheAnimals[1] = chicken;
        allTheAnimals[2] = doge;
        for(FarmAnimal a: allTheAnimals){
        	if(a != null){
        		System.out.println("This is a: " + a.whatAmI() 
        			+ " it's name is: " + a.getName());
        		a.feedMe();
        		a.makeSound();
        	}
        }


        FarmHand lenny = new FarmHand("Lenny");
        FarmHand george = new FarmHand("George");

        lenny.feedTheAnimals(allTheAnimals);

    }
}