package class5Homework;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        /* 7) Ask user to enter their country and capture it. Once values are captured print which language user speaks.
          Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
          any other grade --> Not Acceptable. At the end your program should print which grade was entered by a user with explanation.*/

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=input.next();
        switch (country.toLowerCase()){
            case"england":
                System.out.println("English");
                break;
            case"usa":
                System.out.println("English");
                break;
            case "iran":
                System.out.println("Farsi");
                break;
            case "afghanistan":
                System.out.println("Farsi");
                break;
            case "turkey":
                System.out.println("Turkish");
                break;
            case "china":
                System.out.println("Chinese");
                break;
            default:
                System.out.println("Wrong input");

        }

    }
}
