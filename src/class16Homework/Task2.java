package class16Homework;

public class Task2 {

    public String reverseStr(String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String r=st.toString();
        return r;

    }


    public static void main(String[] args) {
        Task2 task2=new Task2();
        System.out.println(task2.reverseStr("nima"));

    }
}
