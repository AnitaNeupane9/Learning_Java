class Student{
    private String name;
    private int rollNo;
    private int age;

    // no return type
    // static, abstract, synchronized -- keywords are not allowed
    // Default Constructor
    public Student(){
    
    }

    //parameterized Constructor
    public Student(String name, int rollNo, int age) {
        this();     // Use of this keyword to call the current class constructor
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public Student(String name, int rollNo){
        this(name);   // Use of this keyword to call the current class constructor
        this.name = name;
        this.rollNo = rollNo;
    }

    public Student(String name){
        this.name = name;
    }


    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getRollNo() {
        System.out.println( rollNo);
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void getAge() {
        System.out.println(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    void method1(){
        System.out.println("This is method1");
    }

    void method2(){
        System.out.println("This is method2");
        this.method1();
        method1();
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Student std = new Student();
        Student std1 = new Student("abc", 1, 20);
        Student std2 = new Student("pqr");

        std.getName();
        std.getAge();
        std.getRollNo();

        std1.getAge();
        std1.getName();
        std1.getRollNo();

        std1.method2();

        std2.getName();
    }
}
