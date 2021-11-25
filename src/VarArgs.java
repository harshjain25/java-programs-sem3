public class VarArgs {
    static int sum(int ...arr){
        int result =0;
        for(int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("sum of 1 is: "+ sum(1));
        System.out.println("sum of 4 and 5 is: "+sum(4,5));
        System.out.println("sum of 10,20,30 is: "+sum(10,20,30));
    }
}
