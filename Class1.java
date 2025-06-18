public class Class1 {
    public static void main(String[] args) {
        System.out.println("Hello from Class1!");

        // Create an object of Demo class
        Demo demoObj = new Demo();
        demoObj.showMessage();
    }
}

// Demo class
class Demo {
    void showMessage() {
        System.out.println("Hello from Demo class!");
    }
}