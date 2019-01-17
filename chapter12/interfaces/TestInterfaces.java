
public class ChangeArrays {


    
        Breed someAnimal = (Breed)new Bulldog("Spot");


        System.out.println(dog);
        printBreed((Breed)dog);

        Lockjaw lockjaw = new Lockjaw("Lockjaw");
        System.out.println(lockjaw);
        if ( lockjaw instanceof Mythical ){
        	Mythical m = (Mythical)lockjaw;
        	System.out.println("Origin: " + m.getOrigin());
        	System.out.println("  Desc: " + m.getDesc());
        }
}




