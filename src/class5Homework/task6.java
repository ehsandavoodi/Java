package class5Homework;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        /*6)Write a program to find largest number among three numbers
        using nested if provided by a user (numbers must be distinct) */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 number");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a>b){
            if(a>c)
                System.out.println("Largest number: "+a);
        }if(b>a){
            if(b>c)
                System.out.println("Largest number: "+b);
        }if(c>a){
            if(c>b)
                System.out.println("Largest number: "+c);
        }


    }
}
