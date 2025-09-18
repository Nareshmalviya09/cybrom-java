package oopps1;
class ops6{

    //inheritanc
     public static void main(String[] args) {
         teacher t = new teacher();
         t.age=50;
         t.name="rohit sharma";
         t.output();
     }
}


class student{
    String name;
    int age;
    void output(){
        System.out.println("name = "+name);
        System.out.println("age = "+age);
    }
}

class teacher extends student{

}