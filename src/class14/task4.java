package class14;

public class task4 {
    /*4) How would you reverse a String word by word? for example
        //        // input=>This is sentence i want to reverse
        //        // output=>sihT si ecnetnes i tnaw ot esrever*/
    public static void main(String[] args) {
       /*StringBuilder st=new StringBuilder("This is sentence i want to reverse");
        System.out.println(st.reverse());
        String str=st.toString(); // converting a StringBuilder to String so that we can call methods from String
        str.sp*/

        String str="This is sentence i want to reverse";
        String[] arr=str.split(" ");

       /* for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
*/
      /*  for (String word:arr){
            for (int i =word.length()-1; i >=0 ; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
*/

      /*  for (String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }*/
         /*  for (String word:arr){
            System.out.print(new StringBuilder(word).reverse());
            System.out.print(" ");

        }*/
        for (String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }

       /* for (int i = 0; i < arr.length; i++) {
            System.out.print(new StringBuilder(arr[i]).reverse()+" ");
        }*/
    }
}

