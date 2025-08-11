
//polymorephism compile time
class ops8{
    public static void main(String[] args) {
        b b1 =new b();
        b1.show(25);
        b1.show(50, "ms dhoni");
        
    }
}
class a{
    int age;
    String name;
 void show(int a){
    age = a;
    System.out.println("age = "+age);
    }    
}

class b extends a{
    void show(int a,String n){
        age = a;
        name = n;
       System.out.println("age = "+age);
       System.out.println("name = "+name);
    }
}