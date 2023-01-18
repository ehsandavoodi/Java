package class4;

public class ifDemo1 {
    public static void main(String[] args) {

        int money = 15000;


        if (money > 1000) {
            System.out.println("Lets buy an Iphone");
        }

        if (money > 2000) {
            System.out.println("Lets also buy a Macbook");
        }
        boolean motherDay = true;
        if (motherDay) {
            System.out.println("Happy Mother's day");
        }
        // equals method is only used for non-primitives

        String name = "sardar";
        if (name.equals("sardar")) {
            System.out.println("I love football");
        }


    }
}
