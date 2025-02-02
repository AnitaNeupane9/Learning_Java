import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        int a, b, sum;
        String name;

        Scanner sc = new Scanner(System.in);   // Standard Input (keyboard)
        System.out.println("Enter the first number: ");
        a = sc.nextInt();

        System.out.println("Enter the second number: ");
        b = sc.nextInt();

        sum = a + b;
        System.out.println("Addition = " + sum);

        System.out.println("Enter Your Name: ");
        name = sc.next();
        System.out.println(name);

        sc.close();
    }
}
