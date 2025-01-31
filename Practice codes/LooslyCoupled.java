// Step 1: Define an Interface (Abstraction)
interface Engine {
    void start();
}

// Step 2: Implement Different Engine Types
class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol Engine starting...");
    }
}
class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Electric Engine starting...");
    }
}

// Step 3: Use Dependency Injection (Injecting Engine into Car)
class Car {

    void startCar(Engine engine) {
        engine.start();
        System.out.println("Car started.");
    }
}

public class LooslyCoupled {
    public static void main(String[] args) {
        // Using Petrol Engine
        Engine petrolEngine = new PetrolEngine();
        Car petrolCar = new Car();
        petrolCar.startCar(petrolEngine);

        // Using Electric Engine
        Engine electricEngine = new ElectricEngine();
        Car electricCar = new Car();
        electricCar.startCar(electricEngine);
    }
}
