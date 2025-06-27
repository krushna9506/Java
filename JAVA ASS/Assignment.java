public class Assignment {
    public static void main(String[] args) {
        
        int a=20;
        int b = 30;
        a+= b; // a = a + b
        System.out.println("a+=b: " + a); // 50

        int c = 40;
        c%=2;
        System.out.println("c%=2: " + c); // 0
    }
}
