public class DoWhile {
    public static void main(String[] args) {
    int i =1;
    do {
        System.out.println("Value of i: " + i);
        i++; // Increment i to avoid infinite loop
    } while (i < 5);
}
}
