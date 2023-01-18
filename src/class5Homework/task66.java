package class5Homework;

import java.util.Scanner;

public class task66 {
    public static void main(String[] args) {
        /*
        6)Write a program to find largest number among three numbers
         using nested if provided by a user (numbers must be distinct) */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 number");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a>=b) {
            if(a>=c)
                System.out.println("largest number: "+a);
            else
                System.out.println("largest number: "+c);
        } else {
            if(b>=c)
                System.out.println("largest number: "+b);
            else
                System.out.println("the largest number: "+c);
        }
    }
    }

