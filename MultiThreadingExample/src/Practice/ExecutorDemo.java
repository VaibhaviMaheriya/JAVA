package Practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);

        for(int i=0;i<10;i++) {
            int taskId = i;
            service.submit(() -> {
                System.out.println("Task " + taskId + "by "+Thread.currentThread().getName());
            });
        }

        service.shutdown();

//        for (int i = 0; i < 5; i++) {
//            int taskId = i;
//            service.submit(() -> {
//                System.out.println("Task after shutdown"+ taskId+"by "+Thread.currentThread().getName());
//            });
//        }
    }

}
