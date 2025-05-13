class Shape{
    Shape() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    Rectangle() {
        super(); // Implicitly called even if not written
        System.out.println("This is a rectangle");
    }
}

public class SuperConstructorNoParam {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
    }
}
