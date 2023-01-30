package class12;

public class StringDemo9 {
    public static void main(String[] args) {

       String str="jekekdke  3456 *&^%%$£";
       // how many letters?
      int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("Total isAlphabetic in Str "+counter);
        System.out.println("*********************");

        //how many numbers?
        int count=0;
        for (int i=0; i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        System.out.println("Total isDigit in Str :"+count);

    }
}
