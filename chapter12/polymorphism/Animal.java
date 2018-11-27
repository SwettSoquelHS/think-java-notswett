public class Animal {

    String name;

    public Animal(String name){
        this.name = name;
    }

    public String toString(){
        return "I am alive";
    }

    public void print(){
        String s = String.format(">%10s: ", this.getClass().getName());
        System.out.println(s + this);
    }

}