package class5;

public class LogicalOpreators1 {
    public static void main(String[] args) {

        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);
        System.out.println(true||true|false|false|false);

        boolean boughtCho=false;
        boolean boughtFlowers=false;
        if(boughtCho||boughtFlowers){
            System.out.println("I am happy");
        }else{
            System.out.println("I am sad");
        }

        boolean wifi=true;
        boolean fiveG=true;
       /* if (wifi) {
            if(fiveG){
                System.out.println("Internet good"); // instead of nested we use || (Logical Opreator)
            }else{
                System.out.println("Either connect to wifi");
            }
        }*/
        if(wifi||fiveG){
            System.out.println("You are good for browsing the internet");
        }else{
            System.out.println("Either connect to wifi or to 5G");
        }


    }
}
