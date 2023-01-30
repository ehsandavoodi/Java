package class12;

public class StringDemo10 {
    public static void main(String[] args) {
       String str="Java is not pain";
       // it can tell us what is the location , what is the index of a character
        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf('p'));
        System.out.println(str.indexOf("a"));

        for(int i=0 ; i< str.length() ; i++){
            System.out.println(str.charAt(i)+" has the index "+i);
        }
    }
}
