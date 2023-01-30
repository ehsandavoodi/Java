package class16;

public class Task4 {



    String sayHello(String countryName){

         switch (countryName){

             case "USA":
                 return "Hallo";
             case "Kazakhstan":
                 return "Salem";
             case "China":
                 return "Ni hoo";
             default:
                 return "Country Not supported";


         }
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();

        System.out.println(task4.sayHello("Italy"));



    }


}
