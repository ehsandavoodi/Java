package class5Homework;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
    /*
       2) Write a program that will print whether it is a weekend or weekday.
        If any day from 1-5 → output “It is a weekday”,
        anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day” (edited)
  */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter day");
        int day=input.nextInt();
        if(day>=1 && day<=5){
            System.out.println("It is a weekday");
        }else if(day>=6 && day<=7){
            System.out.println("It is a weekend");
        }else{
            System.out.println("Invalid day");
        }
        input.close();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day");
                break;
        }
    }
}
