public class covariant{
   
    public static void main(String[] args) {
        b ob= new b();
        ob.show();
    }
    
}
class a{

     a show(){
        System.out.println("this class a");
        return this;
    }
}
class b extends a{

     b show(){
        super.show();
        System.out.println("this class b");
        return this;
    }
}
