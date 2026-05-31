import java.util.Timer;
import java.util.TimerTask;
public class Main{
    public static void main(String[] args) {
    
        //Timer = Class that schedules tasks at specific times or periodically
        //        Useful for: sending notifications, scheduled updates, repetitive actions

        //TimeTask = Class that represents a task to be scheduled/executed by a Timer
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;
            @Override
            public void run() {
                System.out.println("Timer task executed");
                count--;
                if(count<0){
                    System.out.println("Task completed.");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 0, 1000); // Schedule task to run every second
    }
    }