package class3;

public class ifElse_9 {
    public static void main(String[] args) {

     char c='M';
     if(c=='M') {
         System.out.println("Male");
     }

     String name="Nat";
// with non-primitive data typs such as String we can't use == symbol
     if(name.equals("Sam")){
         System.out.println("Amazing students");
     }
     // !symbol can change true to false and false to true , (for any condition, it dosent matter primitive or non-primitive)
     if(!name.equals("Sam")){
            System.out.println("Super Amazing students");
        }



    }
}
