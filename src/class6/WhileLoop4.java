package class6;

public class WhileLoop4 {
    public static void main(String[] args) {
        int number=1;
        int sum=0;
        while(number<=10){
           sum+=number;     // sum=sum+number;
            number++;
        }
        System.out.println(sum);
    }
}
