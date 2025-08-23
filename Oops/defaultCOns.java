package Oops;

public class defaultCOns {
 public static void main(String[] args) {
     q r= new q();
  r.show();  
 }  

}

class q{
    int a;
         String b;
   
         q(){
        a=25;
        b="naresh";
    }
    void show(){
        System.out.println(a+" "+b);
    }
}
