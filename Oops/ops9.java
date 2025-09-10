import student;

package Oops;
class ops9{
    public static void main(String[] args) {
        student obj =new student();
        obj.show();
    }
}
abstract class person{
    abstract void show();

    person() {
        System.out.println("parent constructor");
    }
    
}
class student extends person{

    public student() {
        System.out.println("child contructor");
    }
    
    
      void show(){
        System.out.println("child class");

    }

}