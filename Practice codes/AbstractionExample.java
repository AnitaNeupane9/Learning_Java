abstract class Animal{

    public abstract void sound(); // abstract method = method with no body
    public abstract void drink();

    public void eat(){
        System.out.println("Eating..");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Barking..");
    }

    public void drink(){
        System.out.println("Dog is drinking..");
    }
}

class Cat extends Animal{
    public  void sound(){
        System.out.println("Meowing..");
    }

    public void drink(){
        System.out.println("Cat is drinking..");
    }
    public void abc(){
        System.out.println("Cat..");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        
        // Dog dog = new Dog();  
        // Cat cat = new Cat();
        // dog.drink();
        // dog.sound();
        // cat.drink();
        // cat.sound();
        // cat.abc();

        Animal dog1 = new Dog();
        Animal cat1 = new Cat();
        dog1.drink();

    }
}
