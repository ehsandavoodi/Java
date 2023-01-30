package class10Project;

public class task11 {
    public static void main(String[] args) {
        /*11)Write a program to print out duplicate elements from an Array of Strings?*/
        String [] arr={"pen","table","water","table","tea","java","jira","java","pen"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate: "+arr[j]);
                }
            }
        }

    }
}
