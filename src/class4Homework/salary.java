package class4Homework;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter numbers of worked years");
        int years=input.nextInt();
        System.out.println("Enter your annual salary");
        int salary=input.nextInt();

        if(years>=5){
            System.out.println("You are eligible for the bonus");
            if(salary>50000){
                System.out.println("You get 5000 bonus");
            }else{
                System.out.println("You get 3000 bonus");
            }
        }else{
            System.out.println("You are NOT eligible for the bonus");
        }




    }
}
