package class16;

public class Task3 {


    void ispalindrom(String str){
        StringBuilder st=new StringBuilder();
        st.reverse();
        String reverseStr=st.toString();
        if(str.equals((reverseStr))){
            System.out.println(str+" is palindrome");
        }else {
            System.out.println(str+" Not is palindrome");
        }



    }

    public static void main(String[] args) {
        Task3 task3=new Task3();

        // String resul

        //  System.out.println(task3.ispalindrom("Kaya"););  can't use void methods in ptintLn
        task3.ispalindrom("Kaya");

    }

}
