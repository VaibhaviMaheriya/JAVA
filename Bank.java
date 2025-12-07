package CustomException;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        int money = 50000;
        int pin = 5432;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Pin: ");
        int p = sc.nextInt();

        if(p == pin){
            System.out.print("How much money you want: ");
            int m = sc.nextInt();

            if(m <= money){
                money-=m;
                System.out.println("Money withdraw successfully");
                System.out.println("Balance: "+ money);
            }
            else{
                try {
                    throw new InsufficientBalanceException();
                }catch (InsufficientBalanceException e){
                    e.printStackTrace();
                }
            }
        }
        else{
            throw new IncorrectPinException() ;
        }
    }

}
