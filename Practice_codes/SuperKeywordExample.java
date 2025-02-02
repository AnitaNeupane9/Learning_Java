
class Animal {
    String color = "white";

    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal {

    String color = "black";

    void eat(){
        super.eat();
        System.out.println("Dog is eating...");
    }
    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

class SuperKeywordExample {

    public static void main(String args[]) {
        Dog d = new Dog();
        d.printColor();
        d.eat();
    }
}
