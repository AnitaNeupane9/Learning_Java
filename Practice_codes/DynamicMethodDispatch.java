// Compile time Polymorphism -- Overloading
// Runtime Polymorphism -- Overriding
class Parent{
    void show(){
        System.out.println("Parent class");
    }
}

class Child1 extends Parent{

    void show(){
        System.out.println("Child1 class");
    }

    // void show(String greet){
    //     System.out.println("Hello " + greet);
    // }
}

class child2 extends Parent{
     
    void show(){
        System.out.println("Child2 class");
    }
}

class Child3 {
    void show(){
        System.out.println("Child3 class");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Child obj = new Child();
        // obj.show();
        // obj.show("abc");

        Parent p = new Parent();  
        p.show();

        Parent obj = new Child1();  // upcasting
        obj.show();
        
        obj = new child2();        // upcasting
        obj.show();

        
        // // instanceof
        // if(obj instanceof Child3){
        //     Child3 child = (Child3) obj;   // downcasting --> chances to occur the ClassCastException
        // }
    }
}

/**
 * Dynamic method dispatch (DMD) --> Runtime polymorphism --> subset of Dynamic Method Lookup
 * Dynamic Method Lookup is a broader concept which refers to the process of looking up the correct method implementation 
 * and describes how jvm maintains the inheitance hierarchy.
 */