package Practice;

public class Bank {

    private int balance ;

    public Bank(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount){

        if(balance>=amount){
            System.out.println(Thread.currentThread().getName()+" Processing...");
            System.out.println(Thread.currentThread().getName()+" Amount withdraw successfull");
            balance-=amount;
            System.out.println(Thread.currentThread().getName()+" Current balance: " + balance);
        }
        else{
            System.out.println("Insufficient Balance for "+Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {
        Bank bank = new Bank(800);

            Runnable task1 = () -> bank.withdraw(500);
            Runnable task2 = () -> bank.withdraw(500);

            Thread t1 = new Thread(task1,"person-1");
            Thread t2 = new Thread(task2,"person-2");

            t1.start();
            t2.start();

    }
}
