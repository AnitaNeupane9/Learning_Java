class Rect {
    double length, breadth;

    Rect(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Box extends Rect {
    double height;

    // complete the defination of Box class
    // Default constructor  (Calling parent constructor with default values and setting the meaningful height instead of 0)
    Box() {
        super(1.0, 1.0);
        this.height = 1.0;
    }

    // Parameterized constructor
    Box(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    // Method to calculate area (Surface Area = 2(lb + bh + hl))
    double area() {
        return 2 * ((length * breadth) + (breadth * height) + (height * length));
    }
}

public class Main {
    public static void main(String[] args) {
        Box B1 = new Box();
        System.out.println("Area of 1st Box is " + B1.area());

        Box B2 = new Box(5.5, 4.5, 3.5);
        System.out.println("Area of 2nd Box is " + B2.area());
    }
}
