package class8;

public class NestedLoop6 {
    public static void main(String[] args) {
       /* for(int i=0;i<=5;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i<=5 ; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println();
        for (int i=0; i<=5; i++){
            System.out.print(3*i+" ");
        }*/


        /*for(int i=0 ; i<3; i++){   // one of student solving
            for (int j=0; j<=(5)*(i+1); j+=i+1) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/
        for (int i=1;i<=3; i++){
            for( int j=0; j<=5;j++){
                System.out.print (i*j+" ");
            }
            System.out.println();
        }

    }
}
