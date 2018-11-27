public class Farm {
    public static void main(String[] args){
        Animal animal1 = new Animal("ocelot");
        Animal animal2 = new Animal("zebra");
        Dog dog1 = new Dog();


        animal1.print();
        animal1 = dog1;
        animal1.print();

    }
}