package Practice;

public class RunnableInterface implements Runnable{


    @Override
    public void run() {
        for(int i = 0; i<=5; i++){
            System.out.println("Runnable "+i+" -> "+Thread.currentThread().getName()+
                    System.currentTimeMillis());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableInterface());

        t1.start();
    }

}
