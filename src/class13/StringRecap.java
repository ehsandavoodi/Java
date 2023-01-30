package class13;

public class StringRecap {
    public static void main(String[] args) {
        String str="Java is Great";
        //How can I print all the letters from this String one by one
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        // What is the input to the charAt() method? It's int AND output is a char
        System.out.println();
        //count how many times the letter a has appeared in the above String
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println("Letter a has appeared "+counter+" Many times");


    }
}
