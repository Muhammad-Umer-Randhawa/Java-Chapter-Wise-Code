import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws InterruptedException{
        
        // for loop: execute a code for a fixed number of times...
        // for(int i = 0; i <= 10; i++){
        //     System.out.println("Hello World");
        // }

        Scanner scanner = new Scanner(System.in);
        // int num;
        // System.out.print("Enter a number how you want to loop: ");
        // num = scanner.nextInt();
        // for(int i = 1; i <= num; i++){
        //     System.out.println(i);
        // }

        int start = 10;
        for(int i = start; i >= 1; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year!!!");
        scanner.close();
// break: break out of a loop (STOP).
// continue: skip the current iteration and continue with the next one (SKIP).

    }
}