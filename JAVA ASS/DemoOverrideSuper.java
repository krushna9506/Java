public class DemoOverrideSuper {
    public void display() {
        System.out.println("Display method in DemoOverrideSuper class");
    }
}

class ChildClass extends DemoOverrideSuper {
    @Override
    public void display() {
        System.out.println("Display method in ChildClass");
    }
}

class TestOverride {
    public static void main(String[] args) {
        DemoOverrideSuper obj1 = new DemoOverrideSuper();
        obj1.display(); // Calls parent class method

        DemoOverrideSuper obj2 = new ChildClass();
        obj2.display(); // Calls overridden method in child class
    }
}
