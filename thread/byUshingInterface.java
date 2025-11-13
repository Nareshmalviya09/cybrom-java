package thread;

public class byUshingInterface {
    
    public static void main(String[] args) {
        A ob= new A();
        Thread t =new Thread(ob);
        t.start();
        for(int i=1; i<5;i++)
        {
            System.out.println("mian");
        }
    }
}


class A implements Runnable{
    public void run(){
        for(int i=1; i<5;i++)
        {
            System.out.println("child");
        }
    }
}