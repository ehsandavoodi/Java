package Project;

import java.util.Scanner;

public class task3 {
    /*Create a 2D array of integer values. Print the sum of all numbers*/
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{10,20,30},{4,5,6},{40,50,60}};
        int sum=0;
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of all numbers = "+sum);
    }
}
