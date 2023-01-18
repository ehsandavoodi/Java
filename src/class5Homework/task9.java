package class5Homework;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        /* 8)HomeWork: Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
         Based on operator provide the result to user. (edited) */
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int x=scan.nextInt();
        System.out.print("Please enter * or + or - Or / : ");
        char calculater=scan.next().charAt(0);
        System.out.print("Please enter second number : ");
        int y=scan.nextInt();
        switch (calculater){
            case'+': System.out.println(x+y);
                break;
            case '*': System.out.println(x*y);
                break;
            case '/': System.out.println(x/y);
                break;
            case '-': System.out.println(x-y);
                break;
            default: System.out.println("Wrong opreation");
        }
                                                                     scan.close();
    }
}
