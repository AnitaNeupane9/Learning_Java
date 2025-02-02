class Animal{
    void sound(){
        System.out.println(" Animal's sound.");
    }
}

class Car extends Animal{
    void speed(){
        System.out.println("Car's speed");
    }
}

public class InstanceofOperator {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Car myCar = new Car();

        System.out.println("is myAnimal  instanceof Animal? : " + (myAnimal instanceof Animal)); // true
        System.out.println("is myAnimal instance of Animal? :  " + (myAnimal instanceof Car));  // false
    }
}
