public class tthrow {
  public static void main(String[] args) {
       
      tthrow t =new tthrow();
    try {  
        t.Ae(100,0);
    } catch (Exception e) {
        System.out.println(e);
    }
  } 
   void Ae(int a,int b){
            if(b==0){
                throw new arithcExcep("divide by zero is wrong");
            }
            else{
            System.out.println(a/b);
        }
    }
}
class arithcExcep extends RuntimeException{

    public arithcExcep(String msg) {
        super(msg);
    }    
}
