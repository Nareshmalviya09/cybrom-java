package thread;

public class byUsingExtnd {
    public static void main(String[] args)  throws Exception {
        a t = new a();
        t.start();
         for(int i =0; i<5;i++){
                System.out.println("malviya");
                Thread.sleep(1000);
            }
            
       
    }
}
class a extends Thread{
    public void run(){
            try {
                for(int i =0; i<5;i++){
                System.out.println("naresh");
                Thread.sleep(1000);
            }
            } catch (Exception e) {
                System.out.println(e);
            }
     }
}

