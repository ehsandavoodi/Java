package class16;

public class SyntaxEmployee {

    String empID;
    double salary;

    String CEO="Sumair";


    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empID="S123";
        emp1.salary=100000;

        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empID="S124";
        emp2.salary=120000;

        System.out.println(emp1.empID);
        System.out.println(emp1.salary);
        System.out.println(emp1.CEO);

    }
}
