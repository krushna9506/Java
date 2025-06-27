public class logical {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //logical AND(&&)
        System.out.println((a<b)&& (b>14));
        //logical OR(||)
        System.out.println((a<b) || (b<14));
        //logical NOT(!)
        System.out.println(!(a<b));
        //logical XOR(^)
        System.out.println((a<b) ^ (b>14));
        //logical NAND
        System.out.println(!((a<b) && (b>14)));
        //logical NOR
        System.out.println(!((a<b) || (b<14)));
        
    }
}
