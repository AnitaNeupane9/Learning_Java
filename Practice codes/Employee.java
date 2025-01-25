
public class Employee {

    int empId; //instance variable
    // static int empId;  // class variable

        public void Working() {
        System.out.println("Employee is working.");

    }

    public static void main(String[] args) {
        int a = 5;  // local variable
        Employee employee = new Employee();
        employee.Working();
    }
}
// class -- blueprint of creating objects
