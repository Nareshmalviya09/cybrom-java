public class superdemo {
    public static void main(String[] args) {
        B b=new B();
        b.c();
    }
}

class A{
    int a=20,b=40;
    A(){
        System.out.println("class A");
    }
    void sum(){
        System.out.println(a+b);
    }
}
class B extends A{
    
    void c(){
        
       super.sum();
        System.out.println("class B "+super.a);
    }
}