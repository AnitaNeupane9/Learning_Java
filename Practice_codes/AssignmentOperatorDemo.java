public class AssignmentOperatorDemo {
    public static void main(String[] args) {

        // simple assignment
        int a = 10;
        int b = a;

    
        System.out.println(a);
        System.out.println(b);

        // compound assignment or shorthand operator
        System.out.println(" += operator: " + (a += 5));  // is equivalent to a = a + 5 
        System.out.println(" -= operator: " + (a -= 5));
        System.out.println(" *= operatpor: " + (b *= a));
        System.out.println(" /= operator : " + ( b /= 2));
        System.out.println(" %= operator : " + (a %= 3));

        int c = a + b - 9 + 3;
        System.out.println("Assignment as Expression: " + c);
    }
}
