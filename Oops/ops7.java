package Oops;

//polymorephism run time
class ops7{
    public static void main(String[] args) {
        b b1 =new b();
        b1.show();
        
    }
}
class a{
 void show(){
        System.out.println("class a");
    }    

}
class b extends a{
    void show(){
        System.out.println("class b");
    }
}