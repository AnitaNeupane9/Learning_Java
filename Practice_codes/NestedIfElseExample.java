public class NestedIfElseExample {
    public static void main(String[] args) {
        int marks = 90;

        if (marks >= 40) {
            if (marks >= 80) {
                System.out.println("A+");
            } else{
                System.out.println("Pass");
            }
        } else{
            System.out.println("Fail");
        }
    }
}
