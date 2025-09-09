public class throwsDemo {
    
    public static void main(String[] args) {
        
       try {
            Wait();
            System.out.println(10/0);
        
       } catch (Exception e) {
        System.out.println(e);
       }
        System.out.println("main ended");
    }
    public static void Wait()throws Exception{
         for(int i=0;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        } 
    }
}
