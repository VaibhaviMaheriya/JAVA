package CustomException;

import java.util.Scanner;

public class Person {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();

        if(age<18){
            throw new InvalidAgeException();
        }
        else{
            System.out.println("Registration Successful");
        }

    }
}
