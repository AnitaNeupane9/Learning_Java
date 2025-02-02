public class IfElseLadder {
    public static void main(String[] args) {
        int marks = 70;
        if (marks >= 90) {
            System.out.println("Grade A");
            
        } else if(marks >= 80){
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
            
        } else{
            System.out.println("Grade D");
        }
    }
}
