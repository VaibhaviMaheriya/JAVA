package Practice;

public class SleepExample {

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            for(int i =1; i<= 5; i++){
                System.out.println("Hello : "+i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                }
            }
        });
        t1.start();
    }
}
