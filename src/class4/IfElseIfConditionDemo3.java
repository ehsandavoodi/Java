package class4;

public class IfElseIfConditionDemo3 {

    public static void main(String[] args) {

        int day=8; // Assign a value to variable

        if (day==1){ // We compare two values
            System.out.println("Monday");// If Block
        } else if (day==2) {
            System.out.println("Tuesday");// else block

        } else if (day==3) {
            System.out.println("Wendesday");

        } else if (day==4) {
            System.out.println("Thursday");

        } else if (day==5) {
            System.out.println("Friday");

        } else if (day==6) {
            System.out.println("Saturday");

        } else if (day==7) {
            System.out.println("Sunday");

        }else {
            System.out.println("Please enter a day between 1 and 7");
        }


    }



}
