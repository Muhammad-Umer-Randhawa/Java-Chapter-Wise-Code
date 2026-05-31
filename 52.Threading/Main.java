import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // Threading = Allows a program to run multiple tasks simultaneously.
        //             Helps improve performance with time-consuming operations.
        //             (File I/O, network requests/communications, etc.)
        //How to create a thread:
        //Option 1: Extend the thread class(simpler).
        //Option 2: Implement the runnable interface(more flexible and better), most appropriate way.

        //Here option 2 is used:

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); //If your main thread is done, you can end all other threads but you want to set those threads to be what is known as "daemon threads".
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have 5 seconds to enter your name");
        thread.start();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();

        //the problem in the code above is that it is first waiting for 5 seconds before asking
        //for the name, then it is displaying and taking the name even after the time's up. 
        //It is because it is all is happening in a single thread, in other words, 
        //java is running all these lines of code step by step, in a one single thread.

        //Here's how to create another thread:
        //Extend the "Runnable" interface to create a runnable object.
    }
}