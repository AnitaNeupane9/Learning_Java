/**
 * 2.	Write a program in Java to create a class Rectangle having data members length and breadth and 
 * three methods called read, calculate and display to read the values of length and breadth, calculate the area and perimeter of the rectangle and display the result respectively.
 Input: Enter length and breadth of a rectangle 
Output: Display area and perimeter of rectangle

 */

import java.util.Scanner;

class Rectangle {
    private float length;
    private float breadth;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = scanner.nextFloat();
    }

    public void calculate() {
        float area = length * breadth;
        float perimeter = 2 * (length + breadth);
        display(area, perimeter);
    }

    public void display(float area, float perimeter) {
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.read();
        rectangle.calculate();
    }
}
