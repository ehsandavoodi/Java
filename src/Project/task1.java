package Project;

import java.util.Scanner;

public class task1 {
   /* 1)Using Scanner create an array of integer values.
    After the array is created, calculate the sum of all stored elements in that array.*/
   public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("Please enter 4 number");

      int[] arr=new int[4];
      int sum=0;
      for (int i = 0; i < arr.length; i++) {
         arr[i]=input.nextInt();
         sum=sum+arr[i];
      }
      System.out.println("Sum : "+sum);
   }
}
