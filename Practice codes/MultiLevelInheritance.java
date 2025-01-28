// 6.	Illustrate the execution of constructors in multi-level inheritance with three Java classes – plate(length, width), 
// box(length, width, height), wood box (length, width, height, thick) where box inherits from plate and woodbox inherits from box class. 
// Each class has constructor where dimensions are taken from user. 
// Input: Enter the dimensions 
// Output: Display the dimensions accordingly


import java.util.Scanner;

//Super class
class Plate {

    protected double length;
    protected double width;

    public Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate dimensions: Length = " + length + ", Width = " + width);
    }
}

class Box extends Plate {
    protected double height;

    public Box(double length, double width, double height) {
        
        super(length, width); 
        this.height = height;
        System.out.println("Box dimensions: Length = " + length + ", Width = " + width + ", Height = " + height);
    }
}

class WoodBox extends Box {

    protected double thick;

    public WoodBox(double length, double width, double height, double thick) {
        super(length, width, height); 
        this.thick = thick;
        System.out.println("WoodBox dimensions: Length = " + length + ", Width = " + width + ", Height = " + height + ", Thick = " + thick);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the plate: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the plate: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the thickness of the wood box: ");
        double thick = scanner.nextDouble();

        WoodBox woodBox = new WoodBox(length, width, height, thick);

    }
}