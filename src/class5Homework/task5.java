package class5Homework;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        /*
        5) Write a program to find largest of three double values using if-else..if and
        logical operators provided by a user (numbers must be distinct)
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 number ");
        double a= input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        if(a>b && a>c){
            System.out.println("largest number: "+a);
        } else if (b > a && b > c) {
            System.out.println("largest number: "+b);
        } else if (c>a && c>b) {
            System.out.println("largest number: "+c);
        }
        input.close();


    }
}
