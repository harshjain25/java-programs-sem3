import java.util.Scanner;
public class prg1{
    public static void main(String[] args){
        int m1,m2,m3;
        Scanner hj=new Scanner(System.in);
        System.out.println("enter the marks of physics");
        m1=hj.nextInt();
        System.out.println("enter the marks of chemistry");
        m2=hj.nextInt();
        System.out.println("enter the marks of maths");
        m3=hj.nextInt();
        float avg=(m1+m2+m3)/3.0f;
        System.out.println("total average of your marks is "+avg);
        if(avg>=40 && m1>33 && m2>33 && m3>33)
            System.out.println("you have been passed");
        else
            System.out.println("sorry, you are failed");

    }
}