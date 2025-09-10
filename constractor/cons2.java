 

public class cons2 {
    public static void main(String[] args) {
        student s1 = new student(26,"aman");
        student s2 = new student(s1);
        s1.show();
        s2.show();
        s1.name="naresh";
        s2.show();
    }
}

class student{
    int age;
    String name;

    student() {
        age=25;
        name="naresh";
       
    }
    student( int age,String name) {
        this.age=age;
        this.name= name;
    
    }
    student(student obj){
         this.age=obj.age;
        this.name= obj.name;
    }
    void show(){
            System.out.println("contractor " + age +" " +name);
    }
    
}


