public class Variable {
    int age = 19;
    static String name = "krushna";

    public void display(){
        int marks =90; // local variable
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        Variable obj = new Variable();
        obj.display();
    }
}
