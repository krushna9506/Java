package OOPS;

public class ClassAndObject {
    public static void main(String[] args) {
        // Creating an object of the MyDemo class
        MyDemo obj = new MyDemo();
        
        // Accessing the method of the MyDemo class
        obj.display();
    }
}

// Definition of the MyDemo class
class MyDemo {
    // Default constructor
    public MyDemo() {
        // You can initialize variables here if needed
    }

    // Method to display a message
    public void display() {
        System.out.println("Hello from MyDemo!");
    }
}

/*
 * Public class MyDemo {
 * -----
 * ----
 * MyDemo obj = new MyDemo();  // fxn or special method (constructor) called when object is created
 * in java constructor name is same as class name
 * in python constructer name is __init(self):
 * in php it is __construct()
 * 
 * }
 */

 /*
  * 1. Defult Constructor:
 *    - A constructor that does not take any parameters.
  */