package Practice;

public class ThreadAndRunnable {

    public static void main(String[] args) {

        Runnable task1 =
                ()->{
                    for (int i = 1; i <=5; i++) {
                        System.out.println(i);
                    }
                };

        Runnable task2 = ()-> {
            for(char ch = 'A' ; ch <= 'E'; ch++){
                System.out.println(ch);
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

    }
}
