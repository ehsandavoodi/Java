package class14;

public class task2 {
    /*Create a String that should be combination of letters, numbers and special characters.
        Find out how many Alphanumeric(abd AZ 284) characters are there in the String.*/
    public static void main(String[] args) {
        String str = "jnfjdnJNJFD87687&*(()";

       /* int alphaCount=0;
        int numberCount=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                alphaCount++;
            }else if (Character.isAlphabetic(str.charAt(i))){
                numberCount++;
            }

        }
        System.out.println(alphaCount+numberCount);
*/
        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());
    }
}
