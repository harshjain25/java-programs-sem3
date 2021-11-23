public class MultiThreading implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            if(i==6){
                try{
                    Thread.sleep(5000);
                } catch(InterruptedException e){
                    System.out.println("Exception"+e);
                }
            }
            System.out.println(i);
        }
    }
}
class MyThread{
    public static void main(String[] args){
        MultiThreading obj=new MultiThreading();
        Thread thread = new Thread(obj);
        thread.start();
    }
}