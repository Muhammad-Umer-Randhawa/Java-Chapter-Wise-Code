public class MyRunnable implements Runnable {
    private String text;
    public MyRunnable(String text) {
        this.text = text;
    }
    @Override
    public void run() {

        for(int i = 1 ; i <= 5 ; i++){
            try{
                System.out.println(text);
                Thread.sleep(1000);
                // To get a threads name:
                // System.out.println(Thread.currentThread().getName() + " " + i);
            }   
            catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
