package Project;

public class task5 {
    /*5)Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.*/
    public static void main(String[] args) {
        int[][] arr={{55,11,22,6},{2,7,9,8},{88,33,47},{10,2,3}};
        int even=0;
        int odd=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]%2==0){
                    even+=arr[i][j];
                }else {
                    odd+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers = "+even);
        System.out.println("Sum of odd numbers = "+odd);
    }
}
