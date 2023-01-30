package class10Project;

public class task8 {
    public static void main(String[] args) {
       /*8)Write a Java Program to print the first 10 numbers of Fibonacci series. */

        int n = 10, first = 0, second = 1;
        System.out.println("Fibonacci Series till  10" );

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + ", ");
            int next = first + second;
            first = second;
            second = next;

        }



    }
}
