package class12;

public class StringDemo11 {
    public static void main(String[] args) {
       String str="Send it to support channel. More java";
       String newStr=str.substring(5);
        System.out.println(newStr);

        System.out.println(str.indexOf("M"));

        System.out.println(str.substring(28));
        // we can also specify the starting point and the ending point
        System.out.println(str.substring(0,27));


       // System.out.println(str.substring(str.length()/2));


    }
}
