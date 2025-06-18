package OOPS;

class Student {
    // Data members
    String name;
    int age;
    int marks;

    // Parameterized Constructor
    Student(String studentName, int studentAge, int studentMarks) {
        name = studentName;
        age = studentAge;
        marks = studentMarks;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        Student s1 = new Student("Alice", 18, 92);
        Student s2 = new Student("Bob", 19, 85);

        s1.display();
        System.out.println();
        s2.display();
    }
}