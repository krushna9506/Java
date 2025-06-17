public class SwitchName {
    public static void main(String[] args) {
        String name = "Krushna";

        switch (name) {
            case "Krushna":
                System.out.println("Hello, Krushna!");
                break;
            case "Aditya":
                System.out.println("Hey Aditya, welcome back!");
                break;
            case "Manasi":
                System.out.println("Hi Manasi, have a great day!");
                break;
            default:
                System.out.println("Hello, guest!");
        }
    }
}
