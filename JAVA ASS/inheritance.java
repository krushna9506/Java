public class inheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move(); // Inherited from Vehicle
        myCar.airConditioning(); // Specific to Car
    }
}

// Parent class
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

// Child class
class Car extends Vehicle {
    void airConditioning() {
        System.out.println("Car has air conditioning");
    }
}
