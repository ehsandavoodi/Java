package class14;

import java.util.Arrays;

public class task3 {
    /*You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String?*/
    public static void main(String[] args) {
        String str="Is it saturday? Is it raining? Do we have a Java Class today?";
      /*  String[] arr=str.split("[ ]");   this for mine
        System.out.println(Arrays.toString(arr));*/

        /*String [] arrr=str.split("[?]");  // this approch is NOT good---> 1) its long  2) Waste more memory because we create an array and we are
        System.out.println(arrr.length);*/  // and we are Not using that array
        System.out.println(str.split("[?]").length);
    }
}
