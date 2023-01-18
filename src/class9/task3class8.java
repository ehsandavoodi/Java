package class9;

import java.util.Scanner;

public class task3class8 {
    public static void main(String[] args) {
        /* Write a program that reads a range of integers (start and end point),
        provided by a user and then from that range prints the sum of the even and odd integers.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter two Number starting point and ending point");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        System.out.println("Starting "+start+" End "+end);
        int sumEven=0;
        int sumOdd=0;
        for (int i=start ; i<=end ; i++){
            if(i%2==0){
                sumEven+=i;  // can also be written like this
            }else {
                sumOdd=sumOdd+i ; //   can also be written like this sumOdd
            }
            System.out.println(i);
        }
        System.out.println("Sum of Even number :"+sumEven);
        System.out.println("Sum of Odd number :"+sumOdd);
    }
}
