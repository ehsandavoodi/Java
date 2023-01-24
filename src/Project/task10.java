package Project;

public class task10 {
    public static void main(String[] args) {
        /*10)Write a java program to find the second largest number in the array?*/
        int[] arr={21,17,33,55,22,9,100,200};
        int l=0;
        int l2=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>l){
                l2=l;
                l=arr[i];
            }
        }
        System.out.println(l2);

    }
}
