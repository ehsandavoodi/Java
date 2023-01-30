package class14;

import java.util.Arrays;

public class MethodsDemo1 {
    public static void main(String[] args) {
        int[] array2={10,20,30,45,50};
        int sum=0;
       /* for (int i = 0; i < arr.length; i++) {
            sum+=array2[i];
        }
        System.out.println(sum);
        System.out.println();*/
        for (int number:array2){
            sum+=number;
        }
        System.out.println(sum);
       // System.out.println(Arrays.toString(arr));

        int[] arr2={10,20,30,45,50};
    }
}
