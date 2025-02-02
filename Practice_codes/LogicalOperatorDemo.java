public class LogicalOperatorDemo {
    public static void main(String[] args) {
        
        boolean x = true;
        boolean y = false;

        int a = 10;
        int b = 3;

        System.out.println(" Logical AND ( x && y): "+ (x && y));
        System.out.println(" Logical OR (x || y): " + (x || y));
        System.out.println(" NOT ( !x): " + (!x));

        System.out.println(" Logical AND ( a > b && b > a): " + (( a > b) && ( b > a)));
        System.out.println(" Logical OR ( a == b) || ( a >= b): " + (( a == b) || ( a >= b)));

        // Logical AND 
        // 0 0 = 0
        // 0 1 = 0
        // 1 0 = 0
        // 1 1 = 1

        // Logical OR
        // 0 0 = 0
        // 0 1 = 1
        // 1 0 = 1
        // 1 1 = 1

        // Logical XOR
        // 0 0 = 0
        // 0 1 = 1
        // 1 0 = 1
        // 1 1 = 0 


        // NOT 
        // 1 = 0
        // 0 = 1
    }
}
