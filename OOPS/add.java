package OOPS;

public class add {
    int a, b;

    public add(int num1, int num2) { // Parameterized Constructor
        // This constructor initializes the data members a and b
        this.a = num1;
        this.b = num2;
    }

    public int sum() {
        return a + b;  // Method to calculate the sum of a and b
    }
    public static void main(String[] args) {
        add obj = new add(10, 20);
        System.out.println("Sum: " + obj.sum());  // Output the sum of a and b
    }
}
