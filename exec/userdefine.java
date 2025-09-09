public class userdefine {
     
   public static void main(String[] args) {
    try {
       Vote(22);
        
    } catch (Exception e) {
     System.out.println(e);
    }
   }

   public static void Vote(int age)throws InvalidageException{
      if(age<18){
          throw new  InvalidageException("not valid");
      }
      else{
          System.out.println("egilible");
      }
   }

}
