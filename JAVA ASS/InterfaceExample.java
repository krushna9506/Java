interface Animal {
    void eat();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats");
    }
    public void makesound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal { // Fixed spelling
    public void eat() {
        System.out.println("Cat eats");
    }
    public void makesound() {
        System.out.println("Cat meows");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.makesound();

        Cat cat = new Cat();
        cat.eat();
        cat.makesound();
    }
}