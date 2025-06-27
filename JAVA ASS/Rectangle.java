class Rect {
    int length = 10;
    int width = 5;
     
    void area() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Rect r = new Rect();
        r.area();
    }
}
