// 1.	Write a class file – box with three data members (length, width, height) and a method volume (). 
// Also implement the application class Demo where an object of the box class is created with user entered dimensions and volume is printed. 
// Input: Enter length, width and height of a box 
// Output: Display the calculated volume of box 

import java.util.Scanner;

class Box {
    private float length;
    private float width;
    private float height;

    public Box(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float volume() {
        return length * width * height;
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the box: ");
        float length = scanner.nextFloat();

        System.out.print("Enter the width of the box: ");
        float width = scanner.nextFloat();

        System.out.print("Enter the height of the box: ");
        float height = scanner.nextFloat();

        Box box = new Box(length, width, height);
        float volume = box.volume();
        System.out.println("The volume of the box is: " + volume);
    }
}


