public class losse {
    
    public static void main(String[] args) {
        car c = new car(new diseleng());
        bike b = new bike(new petroleng());
        c.drive();
        b.drive();
    }
}
interface Engeen{
    void ride();
}
class petroleng implements Engeen{
    public void ride(){
        System.out.println("petrol ");
    }
}
class diseleng implements Engeen{
 
     public void ride(){
        System.out.println("disel ");
    }
}
class car {

    Engeen engeen;
    car( Engeen engeen){
        this.engeen=engeen;
    }
    void drive(){
        engeen.ride();
    }
}
class bike {

    Engeen engeen;
    bike( Engeen engeen){
        this.engeen=engeen;
    }
    void drive(){
        engeen.ride();
    }
}



