public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0 ; i <= 5 ; i++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
            if(i==5){
                System.out.println("Time's up!");
                System.exit(0);// makes the program exit prematurely, like if you wait for 5
                               // seconds, dont enter your name. Time is gonna be up but after that you can
                               //  enter your name and "Hello, name" is still gonna output, to prevent that,
                               //  you can make the program exit prematurely using "System.exit(0)" here 0 is
                               //  the exit code.
            }
        }
    }
}
