public class ops4{
    public static void main(String[] args) {
        person p= new person(25,);
        p.output();
        
    }
}
class person{
    int age;
    String name;
   person(int age,String name){
        this.age=age;
        this.name=name;
   }
    void output(){
        System.out.println("age = "+ age);
        System.out.println("name = "+ name);
    }


}