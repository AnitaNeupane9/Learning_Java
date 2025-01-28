// Single Level Inheritance
// Parent class -- Base/Super class
class Father{
    String familyName = "Yadav";

    public void profession(){
        System.out.println("I am a Lawyer.");
    }

    public void hobby(){
        System.out.println("I like to play Cricket.");
    }
}

// Child Class -- sub class/ Derived class
class Son extends Father{
    String firstName = "Anil";

    public void showFullName(){
        System.out.println("FullName = " + firstName + "  " + familyName);
    }

    public void profession(){
        System.out.println("I am an Engineer.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Son son = new Son();

        son.profession();
        son.hobby();
        son.showFullName();
    }
}


// Overloading 
// same name -- different parameters, different data type with same number of parameter

// Overriding
// same name, same parameter, same datatype -- difference in implementation(Method Body)


//*********************  Practice Questions  *********************************
/**
 * 1. Create a base class called Animal with a method makeSound(). 
 * Inherit a class Dog from Animal and override the makeSound() method to print "Woof!". 
 * Create an instance of Dog and call the makeSound() method.
 */

 /**
  * 2. Create a base class Vehicle with a constructor that initializes the brand and model of a vehicle. 
  Create a subclass Car that inherits from Vehicle and adds an additional attribute doors. 
  In the Car constructor, call the parent class constructor to initialize the brand and model.
  */

  /**
   * 3. Create a class Parent with a method show() that prints "Parent show()". 
   * Create a subclass Child that overrides the show() method to print "Child show()". 
   * In the Child class, use the super.show() method to call the Parent's show() method.
   */

   /**
    * 4. Create a class Calculator with multiple overloaded add() methods that accept 
    different parameter types (e.g., int, double, String). 
    Write code to test each overloaded method.
    */

    /**
     * 5. Create a base class Animal with a method speak(). 
     * Create subclasses Cat and Dog that override the speak() method. 
     * Demonstrate run-time polymorphism by using a reference of type Animal to refer to objects of both Cat and Dog.
     */

     /**
      * 6. Create a class Shape with a method draw(). Create two subclasses Circle and Square, both overriding the draw() method. 
      In a method displayShape(), take a Shape parameter and call draw() on it. 
      Pass instances of Circle and Square to this method and observe polymorphism.
      */