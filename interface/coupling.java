public class coupling {
    
    public static void main(String[] args) {
        rider obj= new rider();
        obj.run();
    }
}
// Tight Coupling
 
class Bike {

    void ride(){
        System.out.println("bike start");
    }
}
class rider{
    Bike bike = new Bike();
     void run(){
        bike.ride();
     }

}