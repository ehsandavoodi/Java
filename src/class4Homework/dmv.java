package class4Homework;

import java.util.Scanner;

public class dmv {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How old are you?");
        int age=input.nextInt();

        if(age>=18){
            System.out.println("You are eligible for driver license");
        }else{
            System.out.println("You get a learner's permit");
        }











    }
}
