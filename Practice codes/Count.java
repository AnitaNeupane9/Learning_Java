// 4.	Aim of the program: Write a program to find no. of objects created out of a class using ‘static’ modifier. 
// Input: Counter variable is set to zero in the program 
// Output: Display the number of objects created


class Count {
    private static int counter = 0;

    public Count() {
        counter++;
    }

    // method to return the counts 
    public static int getCount() {
        return counter;
    }
    
    public static void main(String[] args) {
        //For testing purpose, create some objects
        Count obj1 = new Count();
        Count obj2 = new Count();

        System.out.println("Number of objects created: " + Count.getCount());
    }
}