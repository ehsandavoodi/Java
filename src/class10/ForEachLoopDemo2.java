package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {
        /*Limitation of Foreach Loop */

        int[] arr={10,13,20,25,45,50};
        //Print only the odd numbers from this array with the help of normal for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
        // arr[1]=0 ; This is how we update a single element in an array
        //Replace all the odd numbers in this array with the help of normal loop
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                arr[i]=0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }





    }
}
