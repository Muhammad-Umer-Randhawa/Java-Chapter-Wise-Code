import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //Runtime Polymorphism = When the method that gets executed is decided at runtime based
        //                       on the actual type of object.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Would you like a dog or a cat? (1=dog and 2=cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            Dog dog = new Dog();
            dog.speak();
        }
        else if(choice == 2){
            Cat cat = new Cat();
            cat.speak();
        }
        scanner.close();
    }
}