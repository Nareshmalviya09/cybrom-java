interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol Engine started");
    }
}

class DieselEngine implements Engine {
    public void start() {
        System.out.println("Diesel Engine started");
    }
}

class Car {
    private Engine engine;

    Car(Engine engine) {   // dependency injection
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is running");
    }
}

public class Test {
    public static void main(String[] args) {
        Car car = new Car(new DieselEngine()); // Loose coupling
        car.drive();
    }
}
