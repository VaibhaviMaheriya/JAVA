package Practice;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorExample {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler =  Executors.newScheduledThreadPool(1);

        Runnable task = ()->{
            System.out.println("Current time : "+ LocalTime.now());
        } ;


        scheduler.scheduleAtFixedRate(task,0,2, TimeUnit.SECONDS);

        scheduler.schedule(()->{
            System.out.println("Stoping scheduler");
                scheduler.shutdown();
        },10,TimeUnit.SECONDS );

    }
}
