package class9;

import java.util.Scanner;

public class task4mine {
    public static void main(String[] args) {
        /* Write a program to ask a user to enter item they want to buy and the price of that item.(User will be entering multiple items )
    Every time user enters money accumulate the amount and tell the user how much is left to pay off.
     If user give more money program should return a change. Whenever a user done with payments program should say "Thank you for shopping!"*/
        Scanner scanner=new Scanner(System.in);

        double total=0;
        for(int i=0 ; i<3 ; i++) {
            System.out.println("Please enter first item and second Enter price ");
            String item=scanner.next();
            double price=scanner.nextDouble();
            total+=price;
            System.out.println("Total purchase :"+total);
        }
        System.out.println("Please input your Budget");
        double userMoney=scanner.nextDouble();

        if(userMoney>total){
            userMoney-=total;
            System.out.println("remain :"+userMoney);

        }else {
            System.out.println("you can not buy all of them!!!");
        }
        System.out.println("Thank you for shopping");

        scanner.close();


    }
}
