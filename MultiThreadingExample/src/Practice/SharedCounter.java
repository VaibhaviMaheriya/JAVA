package Practice;

public class SharedCounter {


    private int count = 0;

    public int getCount() {
        return count;
    }

    public synchronized void increment(){
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        SharedCounter count = new SharedCounter();
        Runnable  task = ()->{
            for(int i=0;i<1000;i++){
                count.increment();
            }
        };

        Thread t1 = new Thread(task , "T1 thread");
        Thread t2 = new Thread(task , "T2 thread");
        Thread t3 = new Thread(task , "T3 thread");

        t1.start();
        t2.start();
        t3.start();


        t1.join();
        t2.join();
        t3.join();

        System.out.println("Count : "+count.getCount());
    }
}
