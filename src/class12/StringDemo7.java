package class12;

public class StringDemo7 {
    public static void main(String[] args) {

        String str="I love java";
        boolean startsWith=str.startsWith("I");
        System.out.println(startsWith);

        boolean statsWith2=str.startsWith("I love");
        System.out.println(statsWith2);

        System.out.println(str.endsWith("a"));
        System.out.println(str.endsWith("java"));

        // Method chaining is when multiple methods are called on the same line
        System.out.println(str.toLowerCase().startsWith("i"));
        System.out.println(str.toUpperCase().startsWith("i"));

       // System.out.println(str.length().startsWith("i"));  only those methods can be chaining which returns a String

        System.out.println("**********");
        System.out.println(str.contains("java"));
        System.out.println(str.contains("ja"));
        System.out.println(str.toLowerCase().contains("java"));
    }
}
