public class Main{
    public static void main(String[] args){

        //method = a reusable block of called that runs when called ();
        //methods are unfamiliar of any variables declared within other methods.
        //we can send information to methods using parameters.
        //parameters are like placeholders for the information we want to send.
        //we define parameters inside the parentheses of the method declaration.
        //for example, we could define a method like this: static void happyBirthday(String name) {
        //    System.out.println("Happy Birthday " + name + "!");
        //}

        happyBirthday("Alice", 8); //<---arguments
        happyBirthday("Bob", 9);
        happyBirthday("Charlie", 10);
    }

    static void happyBirthday(String name, int age) { //<----parameters
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear " + name + "!");
        System.out.println("You are " + age + " years old!");
    }
}