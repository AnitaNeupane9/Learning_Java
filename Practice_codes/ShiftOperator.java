public class ShiftOperator {
    public static void main(String[] args) {
        int a = 5;

        // Left right
        System.out.println("Left Shift: " + (a << 2));
        System.out.println(" a * 2^2: " + ( a * (2*2)));

        // Right Shift
        System.out.println(" Right Shift: " + ( 10 >> 2));
        System.out.println(" 10 / ( 2^n): " + (10/ (2*2)));

        // Unsigned Right Shift
        System.out.println(" Unsigned Right Shift: " + ( 10 >>> 2));
        System.out.println(" 10 / ( 2^n): " + (10/ (2*2)));

    }
}
