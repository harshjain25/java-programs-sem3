import java.util.Scanner;
public class Nested_try {
    public static void main(String[] args){
         int[] marks=new int[3];
         marks[0]=1;
         marks[1]=2;
         marks[2]=3;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the index you want to print: ");
         int a = sc.nextInt();
         try{
             System.out.println("Here is the value of given index ");
             try{
                 System.out.println(marks[a]);
             }
             catch(ArrayIndexOutOfBoundsException e) {
                 System.out.println("Sorry this index does not exist");
                 System.out.println("Exception in level 2");
             }
         }
         catch(Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
