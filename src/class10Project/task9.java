package class10Project;

public class task9 {
    public static void main(String[] args) {
        /*9)Maximum and minimum number in the array?*/

        int[] arr={90,50,20,698,900,231,4,99,573,3};
        int max=1;
        int min=9000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }
}
