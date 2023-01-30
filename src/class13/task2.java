package class13;

public class task2 {
    /*2) Create a String and print it in reverse order (Sunday → yadnuS).*/
    public static void main(String[] args) {

        String str="Sunday";
        /*for (int i =5 ; i>=0 ;i--) {
            System.out.print(str.charAt(i));
        }*/

        for (int i=str.length()-1 ; i>=0 ;i--){
            System.out.println(str.charAt(i));
        }
    }
}