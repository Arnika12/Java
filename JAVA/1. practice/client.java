public class client extends Thread{
    public void run(){
      try{
        Thread.currentThread().setName("reverse thread");
        System.out.println("thread name = "+ Thread.currentThread().getName());
        for(char i='Z';i>'A';i--)
        {
            System.out.println(i);
            Thread.sleep(500);
        }
       }
        catch(InterruptedException e){
            System.out.println("error : "+e);
        }
    }

public static void main(String args[]){
    client mythread=new client();
    mythread.start();
}
}