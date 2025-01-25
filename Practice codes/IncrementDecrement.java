public class IncrementDecrement {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 3;

        System.out.println(" post increment ( a++): " + a++); // prints 10, then becomes 11
        System.out.println(a); // 11
        System.out.println(" pre increment ( ++a): " + (++a)); // prints 12

        System.out.println(" post decrement (b--): " + (b--)); // prints 3, then becomes 2
        System.out.println(b); // 2
        System.out.println(" pre decrement (--b): " + (--b)); // prints 1

    }
}
