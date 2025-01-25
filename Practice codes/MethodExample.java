// class abc{
//     MethodExample obj = new MethodExample();
//     obj.add(3,2);
// }


public class MethodExample{

   private static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        String name = "abc";
        System.out.println(name.length());

        MethodExample obj = new MethodExample();
        System.out.println(obj.add(3, 2));
        add(4,5);
    }
}

// data type
// primitive and non primitive
// integer  -- byte, short, int,long
// Float -- float, double
// char -- char, String
// boolean -- bool

//camelCase Naming Convention
// add, fibonacciSeries