package class10Project;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    /*2)Using Scanner create an array of countries. When an array is created,
     retrieve all values from it and while retrieving those values print capital for each country. (use 2 different loops).*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter united kingdom countries");
        String[] arr=new String[4];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=input.nextLine();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            switch(arr[i].toLowerCase()){
                case"england":
                    System.out.println("England Capital: "+"London");
                    break;
                case "wales":
                    System.out.println("Wales Capital: "+"Cardiff");
                    break;
                case "scotland" :
                    System.out.println("Scotland Capital: "+"Edinburgh");
                    break;
                case "northern ireland":
                    System.out.println("Northern Ireland: "+"Belfast");
                    break;
                default:
                    System.out.println("Wrong country");
            }
        }
    }
}
