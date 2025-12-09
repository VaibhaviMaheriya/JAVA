package Practice;

public class RunnableExample {

    public static void main(String[] args) {

        Runnable even = ()->{
            for(int i = 1; i<=10; i++){
                System.out.println("Even : "+ (i*2));
            }
        };

        Runnable odd = ()->{
            for(int i = 1; i<=10;i++){
                System.out.println("Odd : "+ ((i*2)-1));
            }
        };

        Runnable hello = ()->{
            for (int i = 1; i<=5; i++){
                System.out.println("Hello "+i);
            }
        };

        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);
        Thread t3 = new Thread(hello);

        t1.start();
        t2.start();
        t3.start();



    }


}
