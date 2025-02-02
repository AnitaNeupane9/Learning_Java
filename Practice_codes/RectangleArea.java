// 5.	Write a program in java using constructor overloading concept to calculate the area of a rectangle having data member as length and breadth.
// Use default constructor to initialize the value of the data member to zero and 
// parameterized constructor to initialize the value of data member according to the user input.
// Input: Enter the value of length and breadth of rectangle 
// Output: Display the area of rectangle accordingly.


import java.util.Scanner;

class Rectangle {

    private double length;
    private double breadth;

    // Default constructor
    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    // Parameterized constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

public class RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Area of rectangle (Using default constructor):  " + defaultRectangle.calculateArea());

        System.out.print("Enter the length of Rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of Rectangle: ");
        double breadth = scanner.nextDouble();

        Rectangle parameterizedRectangle = new Rectangle(length, breadth);
        System.out.println("Area of rectangle (Using Parameterized Constructor) " + parameterizedRectangle.calculateArea());

    }
}