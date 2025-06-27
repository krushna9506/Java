class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Singleinheritance extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
    void callSuperSound() {
        super.sound();
    }
}

public class Main {
    public static void main(String[] args) {
        Singleinheritance dog = new Singleinheritance();
        dog.sound(); // Output: Dog barks
        dog.callSuperSound(); // Output: Animal makes sound
    }
}
