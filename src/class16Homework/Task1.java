package class16Homework;

import class16.Task7;

public class Task1 {

    int sumArray(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;


    }

    public static void main(String[] args) {

        Task1 task1=new Task1();
        int [] arr={100,200,300};
        System.out.println(task1.sumArray(arr));

    }


}
