package class16;

import java.util.Scanner;

public class Students {
    String Name;
    int ID;
  static  int numberOfStudents;


    public static void main(String[] args) {
        Students firstStudent=new Students();
        firstStudent.Name="Xerxes";
        firstStudent.ID=8790;
        firstStudent.numberOfStudents++;

        Students secondStudent=new Students();
        secondStudent.Name="Arta";
        secondStudent.ID=3291500;
        secondStudent.numberOfStudents++;


        Students thirdStudent=new Students();
        thirdStudent.Name="Cyrus";
        thirdStudent.ID=18374;
        thirdStudent.numberOfStudents++;

        System.out.println(Students.numberOfStudents );
        Scanner scanner=new Scanner(System.in);
        scanner.next();
        String sr="wdwedw";
    }
}
