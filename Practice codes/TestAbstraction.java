
abstract class Bike {

    //Default Constructor
    Bike() {
        System.out.println("bike is created");
    }

    // Parameterized Constructor
    Bike(String name){
        System.out.println("bike is created with name " + name);
    }

    // abstract method
    abstract void run();

    // Non-abstract method
    void changeGear() {
        System.out.println("gear changed");
    }
}

class Honda extends Bike {
    // Overrides the abstract method run()
    void run() {
        System.out.println("running safely..");
    }
}

class TestAbstraction {
    public static void main(String args[]) {
        Bike obj = new Honda();  // creating the Honda obj with the reference of Bike
        obj.run();
        obj.changeGear();
    }
}
