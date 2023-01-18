package class4Homework;

import java.util.Scanner;

public class creditCard {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Do you have a creditcard?");
        String creditcard=input.nextLine();
        if(creditcard.equals("no")){
            System.out.println("Do you want a creditcard?");
            String card=input.nextLine();
        }else{
            if(creditcard.equals("yes")){
                System.out.println("What is the balance on the card?");
                int balance=input.nextInt();
                if(balance>1000){
                    System.out.println("Pay off immediately");
                }else{
                    System.out.println("You can spend more");
                }

            }
        }
    }
}
