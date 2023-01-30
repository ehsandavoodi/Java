package class16Homework;

public class Task3 {

    private String vowel(String str){

        String newString=str.replaceAll("[^aeiou]","");
        return newString;

    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        System.out.println(task3.vowel("tomorrow"));
    }




}
