public class increment {
    public static void main(String[] args) {
        int a = 20;
        int b = 90;

        // increment in a
        a++;
        System.out.println("After increment in a = " + a);

        // decrement in b
        b--;
        System.out.println("After decrement in b = " + b);

        ++a;
        --b;
        System.out.println("After pre increment in a :" + a);
        System.out.println("After pre decrement in b : "+ b);
    }
}
