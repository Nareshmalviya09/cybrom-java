package Oops;

public class ConstractorOverloading {
    public static void main(String[] args) {
        a r=new a();
        a r1=new a(50);
        a r2=new a("naresh",30.96);
        System.out.println(r.x +" "+ r.y+" " + r.z);
        System.out.println(r1.x);
        System.out.println(r2.y+" " + r2.z);

        

    }
    
}
class a{

    int x;
    double y;
    String z;
    a(){
        x=10; y=52.12; z="naresh";
    }
    a(int b){
        x=b;
    }
    a(String c,double d){
        z=c;
        y=d;
    }
}
