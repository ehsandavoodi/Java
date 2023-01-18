package class8Homework;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
       /* 2) Create a program that will be asking user to apply for a credit card 10 times.
            As soon you get an “yes” from a user program should stop asking.*/
        for (int i=0;i<=9;i++){
            System.out.println("Please apply for a credit card");
        }
        Scanner input=new Scanner(System.in);

        String credit=input.next();
        if(credit.equals("Yes")){
            System.out.println();
        }

    }
}
