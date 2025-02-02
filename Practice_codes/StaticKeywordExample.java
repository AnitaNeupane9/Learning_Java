// static variable, class, method, block

class Employee{
    private int id;
    private String name;

    private static String officeName = "abc";
    public static int count = 0;

// final 

    //construtor
    public Employee(){
        System.out.println("constructor is calling.");
        count++;
    }

    // Static block
    static {
        // to initialize static variables
        // 
    }


    public static void getCount(){
        System.out.println(count);
    }

    //getter & setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static String getOfficeName() {
        return officeName;
    }

    public static void setOfficeName(String officeName) {
        Employee.officeName = officeName;
    }
    
}

public class StaticKeywordExample {
    public static void main(String[] args) {
        Employee employee = new Employee();  
        Employee employee1 = new Employee();

        // employee.getCount();
        // employee1.getCount();

        Employee.setOfficeName("pqr");
        System.out.println(employee.getOfficeName());
        System.out.println(employee1.getOfficeName());

        Employee.getCount();

    }
}
