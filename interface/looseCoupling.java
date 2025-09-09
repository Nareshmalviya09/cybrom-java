public class looseCoupling {
    public static void main(String[] args) {
        rider obj = new rider(new Scooter());
        rider obj1 = new rider(new car());
        obj.run();
        obj1.run();
    }
}
interface vehicle {
    void ride();
}

class Scooter implements vehicle {

    public void ride() {
        System.out.println("Scooter start");
    }
}

class car implements vehicle {
    public void ride() {
        System.out.println("car start");
    }
}
class rider {
    
    vehicle Vehicle;
    rider(vehicle Vehile) {
        this.Vehicle = Vehile;
    }

    void run() {
        Vehicle.ride();
    }

}