public class MethodOverloading {

    public int Sum(int a, int b){
        return a + b;
    }

    public int Sum(int a, int b, int c){
        return a + b + c;
    }


    public float Sum(float a, float b){
        return a + b;
    }


    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        System.out.println(obj.Sum(4,3));
        System.out.println(obj.Sum(5,6,9));
        System.out.println(obj.Sum(1.0f, 3.0f));
    }
}

