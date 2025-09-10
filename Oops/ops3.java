package Oops;
public class ops3{
    public static void main(String[] args) {
        person p= new person();
        // p.input(24, "naresh");
        p.output();
        
    }
}
class person{
    int age;
    String name;
    void input(int a,String n){
        age = a;
        name = n;
    }
    void output(){
        System.out.println("age = "+ age);
        System.out.println("name = "+ name);
    }

}