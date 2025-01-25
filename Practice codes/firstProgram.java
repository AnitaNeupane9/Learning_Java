// states -- variables , methods -- behavior
// blueprint of creating obj.. 
class Bike{

    // instance variable -- class variable 
    String color = "black" ;
    int speed;
     float floatDatatype= 0.02f;
     double d = 0.02;
     char c = 'A';
     String s = "Anil";
     bool b = true;

    void drive(){
        int a = 10;
        System.out.println("Bike is driving.");
    }

}

public class firstProgram{
    public static void main(String[] args) { // main method
        Bike bike = new Bike();
        bike.drive();
    }
}

// JAVA -- Platform Independent 
// jdk , jre, jvm 

// comments 
// -- single line comment

/*
 *  multiline comments
 */

/**
 * documentation
 */

 // variable 
 // store -- permanent / temporary 
 // db -- variable 

 // datatype variable_name; strongly typed language 




 // Data types -- 
 /*
  * integer -- byte, short,  int, long  -- 1, 2, , 4, 8 bytes respectively 
  float   -- float, double -- precision -- 4, 8
  char -- char., String -- 2 
  boolean -- true, false -- bool
  */

  // Type Conversion / Type Casting 
  /*
   * Implicit --  widening -- automatically done by java -- converts a smaller data type to large data type -- no data loss
   * Explicit -- narrowing  -- manually  -- 
   */

   //scope of the variable
