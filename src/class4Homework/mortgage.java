package class4Homework;

public class mortgage {
    public static void main(String[] args) {
        double rate=4.5;
        int price=200000;
        if(rate>4.5){
            System.out.println("User will not buy a house");

        }else {
            System.out.println("User will consider buying a house");

            if (price > 200000) {
                System.out.println("User will take a loan");
            } else {
                System.out.println("User will pay cash");
            }

        }







    }

}
