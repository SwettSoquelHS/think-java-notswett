public class TestInterfaces {

    public static void main(String[] args){
        Animal a = new Animal();


        Animal dog = new Bulldog("Fido");

        System.out.println(dog);
        printBreed((Breed)dog);
    }


    public static void printBreed(Breed aBreed){
    	System.out.println("The breed is: " + aBreed.getBreed() );
    }
}