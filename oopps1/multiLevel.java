package oopps1;

public class multiLevel {
    public static void main(String[] args) {
        sub3 ob = new sub3();
        ob.sum();
        ob.sub();
        ob.multi();
        ob.div();
        ob.rem();
    }
    

}
class sub1 {
    int a,b,c;
    void sum(){
        a=10;
        b=20;
        System.out.println(a+b);
    }
    void sub(){
        a=50;
        b=25;
        System.out.println(a-b);
    }
}
class sub2 extends sub1{
    void multi(){
        a=5;b=5;
        System.out.println("miltiplication "+a*b);
    }
    void div(){
        a=10;b=2;
        System.out.println("division "+a/b);
    }
}
class sub3 extends sub2{
    void rem(){
        a=25;b=30;
        System.out.println("reminde " + a%b);
    }
}
