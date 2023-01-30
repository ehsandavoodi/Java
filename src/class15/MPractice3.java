package class15;

public class MPractice3 {
    /* Create a method that takes an array of int sum all elements from the array and
     return the sum
     */

   int sumArray(int[] arr){
       int sum=0;
       for (int i = 0; i < arr.length; i++) {
           sum+=arr[i];
       }
       return sum;
   }

}
