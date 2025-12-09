package Practice;

public class SingleThreadTest {

    public static long heavyTask() {
        long sum = 0;

        for(int i =1; i<= 50_00_000; i++){
            sum+=i;
        }
        return sum;
    }


    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        for(int i =1; i<= 5; i++){
            heavyTask();
        }


        long end = System.currentTimeMillis();

        System.out.println("Single Thread time: "+ (end-start));
    }
}
