package class5Homework;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /*
 3) Write a program that will read three inputs of scores (quiz, mid term, and final scores)
  and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F  */
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter quiz score :");
        int quiz=input.nextInt();
        System.out.print("Please enter mid term score :");
        int midTerm= input.nextInt();
        System.out.print("Please enter final score :");
        int finalScore=input.nextInt();
        int average=(quiz+midTerm+finalScore)/3;
        if(average>=90){
            System.out.println("grade=A");
        }else if(average>=70 && average<90){
            System.out.println("grade=B");
        } else if(average>=50 && average<70){
            System.out.println("grade=C");
        } else if (average<50 ) {
            System.out.println("grade=F");
        }

    }
}
