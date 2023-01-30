package class10Project;

public class task4 {
    /*Create a 2D array or integer type where you will store odd and even numbers.
    Develop a program which will identify/print the even numbers only.*/
    public static void main(String[] args) {

        int[][] arr = {{12, 15, 18, 11}, {2, 60, 40, 55}, {21, 567, 32, 44, 70}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }




    }
}
