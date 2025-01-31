class petrolEngine {
    void start() {
        System.out.println("Engine starting...");
    }
}

class electricEngine {
    void start() {
        System.out.println("Engine starting...");
    }
}

// Car class depends directly on Engine class
class Car {
    // private Engine engine = new Engine(); // Direct dependency

    void startCar(petrolEngine engine) {
        engine.start();
        System.out.println("Car started.");
    }
}

class A{
    void display(){
        System.out.println("Hello");
    }
}

public class TightlyCoupled {
    public static void main(String[] args) {
        Car car = new Car();
        petrolEngine engine = new petrolEngine();
        car.startCar(engine);
    }
}
