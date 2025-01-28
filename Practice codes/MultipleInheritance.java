// Not supported through class in java
class A{
    public void name(){
        System.out.println("This is first parent.");
    }
}

class B{
    public void name(){
        System.out.println("This is second parent.");
    }
}

class C extends A,B {
    public void display(){
        System.out.println("This is child class.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.name();
    }
}


// four pillars of OOPs concept 
// 1. Inheritance
// 2. Polymorphism  --> poly = many and morphism = forms
// 3. Abstraction
// 4. Encapsulation