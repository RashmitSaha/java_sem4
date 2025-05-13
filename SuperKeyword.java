class Rectangle1 {
    int l= 10;
    int b=20;
}

class Rectangle2 extends Rectangle1 {
    int l= 5;
    int b=10;

    void area() {
        System.out.println("Area 1: " + super.l*super.b);
        System.out.println("Area 2: " + l*b);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Rectangle2 rect = new Rectangle2();
        rect.area();
    }
}
