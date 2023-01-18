package class4Homework;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your city");
        String city=input.nextLine();
        System.out.println("Enter the temperature in fahrenheit");

        double f=input.nextDouble();
        double c=(f-32)*(0.55556);
        System.out.println("The temperature in "+city+" is "+c+" degree celsius");

    }
}
