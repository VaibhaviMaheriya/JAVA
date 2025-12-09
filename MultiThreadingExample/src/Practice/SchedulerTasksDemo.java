package Practice;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerTasksDemo {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        Runnable dateTask = ()->{
            System.out.println("Date : "+ LocalDateTime.now());
        };

        Runnable quoteTask = ()->{
            System.out.println("Quote : You are doing great keep going.");
        };

        Runnable randomNum = ()->{
            System.out.println("Random Number : "+ new Random().nextInt(100));
        };


        scheduler.scheduleWithFixedDelay(dateTask, 0,3, TimeUnit.SECONDS);
        scheduler.scheduleWithFixedDelay(quoteTask, 0,3, TimeUnit.SECONDS);
        scheduler.scheduleWithFixedDelay(randomNum, 0,3, TimeUnit.SECONDS);


//        scheduler.shutdown();
    }
}
