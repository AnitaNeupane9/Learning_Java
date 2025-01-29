// addition of n numbers using command line arguments
// By using the command line argument concept, take the name from command line and display.
public class CommandLineArgumentExample {
    public static void main(String[] abc) {
        // int a,b,sum;

        // a = Integer.parseInt(args[0]);
        // b = Integer.parseInt(args[1]);

        // sum = a + b;
        // System.out.println("Addition: " + sum);

        String name = abc[1];
        System.out.println(name);

        int len = abc.length;
        int sum = 0;

        for(int i = 0; i < len; i++){
            sum = sum + Integer.parseInt(abc[i]);
        }
        System.out.println("Addition = " + sum);
    }
}
