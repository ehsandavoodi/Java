package class9;

public class ArraysDemo1 {
    public static void main(String[] args) {
        String [] names={"Slava","Safi","Jason","Nabi","Anees","Joseph"};
        // write a loop to print all the name from array

        System.out.println(names.length);

        for(int i=0; i<= names.length ;i++) {
            System.out.print(names [i] +" ");
        }

    }
}
