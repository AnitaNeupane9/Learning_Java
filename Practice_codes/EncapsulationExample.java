// Ways to achieve Encapsulation
// 1. By declaring instance variable as private
// 2. By using the getter and setter methods

class Student{

    private String name;
    private int age;
    private int rollNo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age < 0){
            System.out.println("Age cannot be negative");
            age = 0;
        }
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    public void displayDetails(){
        System.out.println("Name: " + name + ", age : " + age + ", rollNo: " + rollNo);
    }

}

public class EncapsulationExample{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Anil");
        System.out.println(s.getName());

        s.setAge(-10);
        System.out.println(s.getAge());

        s.setAge(20);
        System.out.println(s.getAge());

        s.displayDetails();
    }
}

