package class5Homework;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        /*4)Write a program for user to enter his/hers birth month. Based on the month define the season.
                Example: if user is born in June, July or August → season =”Summer”.
        At the end of the program we should see output as “You were born __”  */
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your birth month");
        String month=input.next();
        if(month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")){
            System.out.println("Season = Spring");
        }else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
            System.out.println("Season = Summer ");
        } else if (month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")) {
            System.out.println("Season = Autumn");
        } else if(month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")){
            System.out.println("Season = Winter");
        }else {
            System.out.println("Invalid");
        }
        input.close();




    }
}
