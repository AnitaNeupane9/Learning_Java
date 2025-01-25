// 3.	Write a program which will overload the area () method and 
//  display the area of a circle, triangle and square as per user choice and user entered dimensions. 

// Input: Enter user’s choice number (Eg. Choice=1 ->Area of Circle, Choice=2 - >Area of Triangle, Choice=3 ->Area of Square) 
// Enter dimensions like radius, base, height, side as per the entered choice 
// Output: Display area of circle Display area of triangle Display area of square


import java.util.Scanner;

class Shape {
    
    //calculate area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius; 
    }
    
    //calculate area of a triangle
    public double area(double base, double height) {
        return 0.5 * base * height; 
    }
    
    //calculate area of a square
    public double area(int side) {
        return side * side;
    }
}

public class ShapeArea {
    public static void main(String[] args) {

        double areaResult;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number from (1,2,3):");
        System.out.println("1 (Area of Circle)");
        System.out.println("2 (Area of Triangle)");
        System.out.println("3 (Area of Square)");
        int choice = scanner.nextInt();

        Shape shape = new Shape();


        switch(choice) {
            case 1:
                // Area of Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                areaResult = shape.area(radius);

                System.out.println("Area of the Circle: " + areaResult);
                break;

            case 2:
                // Area of Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();

                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();

                areaResult = shape.area(base, height);
                System.out.println("Area of the Triangle: " + areaResult);
                break;

            case 3:
                // Area of Square
                System.out.print("Enter the side of the square: ");
                int side = scanner.nextInt();

                areaResult = shape.area(side);
                System.out.println("Area of the Square: " + areaResult);
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
