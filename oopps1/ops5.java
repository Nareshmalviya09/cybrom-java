package oopps1;
public class ops5{
    public static void main(String[] args) {
        person p= new person(30);
        System.out.println(p.output());
    
        
    }
}
class person{
   private  int age;
   
   person(int age){
        this.age=age;
       
   }
    int output(){
        return age;
        
    }


}