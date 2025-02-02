class A{
    public void name(){
        System.out.println("This is parent class");
    }

    public void greet(){
        System.out.println("Hello.");
    }
}

class B extends A{
    public void name(){
        System.out.println("This is child class. ");
    }
}

class C extends A{
    public void name(){
        System.out.println("This is another child class");
    }
}

public class HierarchialInheritance {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        b.name();
        b.greet();
        c.name();
        c.greet();
    }
}
