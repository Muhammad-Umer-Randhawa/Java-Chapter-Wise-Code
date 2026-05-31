public class Main{
    public static void main(String[] args){
        //Interfaces = A blueprint for a class that specifies a set of abstract methods that 
        //             that implementing classes MUST define.
        //             Supports multiple inheritance-like behaviour.

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

        Hawk hawk = new Hawk();
        hawk.hunt();
    }
}