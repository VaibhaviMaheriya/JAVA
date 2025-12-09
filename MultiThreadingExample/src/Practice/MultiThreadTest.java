package Practice;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadTest {

    public static long heavyTask(){

        int sum =0 ;

        for(int i =1; i<= 50_00_000; i++){
            sum +=1;
        }
        return sum;
    }

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(5);
        long start = System.currentTimeMillis();

        for(int i =1; i<= 5; i++){

            service.submit(()->{
               heavyTask();
            });
        }
        service.shutdown();;

        long end = System.currentTimeMillis();

        System.out.println("Multithreaded Thread time: "+ (end-start));



    }


}
