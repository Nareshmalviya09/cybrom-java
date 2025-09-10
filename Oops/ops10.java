package Oops;
class ops10{
 public static void main(String[] args) {
    b obj =new b();
    obj.show();
    obj.output();
    System.out.println(a.name);
    System.out.println(a.number);

 }
}
interface a {
    int number = 500;
    String name ="naresh";
    void show();
    void output();
}

class b implements a{
    public void show(){
        System.out.println("show mathod");
    }
    public void output(){
        System.out.println("show output");
    }
}