public class Instance {
    public static void main(String[] args) {
    String str= "Krushna";
    boolean result;
    result= str instanceof String;
    System.out.println("Is str an instance of String? : " + result);

    String str1="krushna ";
    String str2="Donge";
    String str3=str1+str2;
    System.out.println("concat: "+ str3);
    }
}
