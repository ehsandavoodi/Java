package class4Homework;

import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        Scanner loan=new Scanner(System.in);
        System.out.println("How much loan do you need?");
        int need=loan.nextInt();

        if(need<=200000){
            System.out.println("Loan is approved ");
        }else{
            System.out.println("Loan is rejected");
        }





    }
}
