import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if(name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello, " + name + "!");
        }

        if(age >= 65){
            System.out.println("You are a senior citizen.");
        }
        else if(age >= 18){
            System.out.println("You are an adult.");
        } 

        else {
            System.out.println("You are a child.");
        }
        scanner.close();
    }
}