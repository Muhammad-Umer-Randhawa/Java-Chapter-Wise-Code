public class Main{
    public static void main(String[] args){
        Thread thread1 = new Thread(new MyRunnable("Ping"));
        Thread thread2 = new Thread(new MyRunnable("Pong"));

        System.out.println("Game started!");
        thread1.start();
        thread2.start();
        try{
            thread2.join();
            thread1.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Game over!");
    }
}