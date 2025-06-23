public class ifelse {
    public static void main(String[] args) {
        
    
    int a=20;
    int b=30;

    if (a<b){
        System.out.println("a is less than b");
    }
    else if (a>b){
        System.out.println("a is greater than b");
    }
    else{
        System.out.println("a is equal to b");
    }
    String result;
    if (a%2==0){
        result="a i Even Number";
    }
    else{
        result="a is Odd Number";
    }
    System.out.println(result);
}
}
