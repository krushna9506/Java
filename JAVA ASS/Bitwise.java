public class Bitwise {
    public static void main(String[] args) {
        int a =5;
        int b = 3;
        // Bitwise AND (&)
        System.out.println("a & b: " + (a & b)); // 1
        // Bitwise OR (|)
        System.out.println("a | b: " + (a | b)); // 7
        // Bitwise XOR (^)
        System.out.println("a ^ b: " + (a ^ b)); // 6
        // Bitwise NOT (~)
        System.out.println("~a: " + (~a)); // -6
        // Bitwise left shift (<<)
        System.out.println("a << 1: " + (a << 1)); // 10
        // Bitwise right shift (>>)
        System.out.println("a >> 1: " + (a >> 1)); // 2
        // Bitwise unsigned right shift (>>>)
        System.out.println("a >>> 1: " + (a >>> 1)); // 2
        
    }
}
