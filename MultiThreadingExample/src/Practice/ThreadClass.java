package Practice;

public class ThreadClass extends Thread {

    public void run(){
        for(int i = 0; i<=5; i++){
            System.out.println("Thread "+i+" -> "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();
        t1.start();
    }


}
