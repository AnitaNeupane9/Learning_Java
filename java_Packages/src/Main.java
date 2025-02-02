import com.alien.javaPackages.package1.Student;
import com.alien.javaPackages.package2.Animal;


public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Student student = new Student();

        Animal.Test obj = new Animal.Test();
        obj.abc();

        animal.showMessage();
        student.eat();
    }
}
