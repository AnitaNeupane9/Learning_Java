public class typecasting {
    public static void main(String[] args) {
        // implicit
        // int num = 100;
        // double d = num;
        // System.out.println(num);
        // System.out.println(d);

        //explicit
        double number = 9.09;
        String s = "123";
        int result = (int)number;
        int toNumber = Integer.parseInt(s); // string to integer conversion

        String str = String.valueOf(toNumber); // integer to string 

        System.out.println(str);
        System.out.println(toNumber);
        System.out.println(s);
        // System.out.println(number);
        // System.out.println(result);
    }
}
