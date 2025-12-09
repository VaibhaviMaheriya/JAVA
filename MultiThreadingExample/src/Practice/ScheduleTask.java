package Practice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleTask {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = ()-> System.out.println("Backup Started");

        scheduler.schedule(task,5, TimeUnit.SECONDS);

        scheduler.shutdown();
    }
}
