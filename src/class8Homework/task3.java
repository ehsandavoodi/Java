package class8Homework;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /* Write a program that reads a range of integers (start and end point),
         provided by a user and then from that range prints the sum of the even and odd integers.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number expect zero :");
        int x=input.nextInt();
        System.out.println("Please enter second number expect zero :");
        int y=input.nextInt();
        int sumeven=0;
        int sumodd=0;
        for(int i=x;i<=y;i++){
            System.out.println(i);
       if (i%2==0){
          sumeven+=i;
       }else{
           sumodd+=i;
       }


        }
        System.out.println("sum of the even :"+sumeven);
        System.out.println("sum of the odd :"+sumodd);
        input.close();
    }

}



