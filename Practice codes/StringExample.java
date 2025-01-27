public class StringExample {
    public static void main(String[] args) {

        char n = 'A';
        int a = 1;
        int b = 1;
        String s = "Hello";

        char[] ch = {'a', 'b', 'c', 'd'};
        // Sequence of characters
        
        // ways to create String
        // Heap -- String Pool
        String name = new String("Ram");
        String name1 = new String("Ram");

        String address = new String("Nepal");
        String address1 = "Nepal";
        String address2 = "Nepal";

        String greet = s;
        String greet1 = new String(s);
        String random = new String(ch);
        String random1 = new String(ch, 1, 2);   // (ch, index, total number of characters in string)

        // String Concatenation
        String name2 = name + address;
        name = name.concat(s);

        // String abc = 'abc';
        System.out.println(name);
        System.out.println(address);
        System.out.println(name2);
        System.out.println(random);
        System.out.println(random1);
        System.out.println(name.length());


        // System.out.println(a == b);
        System.out.println(name == name1);
        System.out.println(address == address1);
        System.out.println(address1 == address2);

    }
}
