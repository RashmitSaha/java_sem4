class Square {
    Square(int x) {
        System.out.println("This is a square with side: " + x);
    }
}

class Rectangle extends Square{
    Rectangle(int x, int y) {
        super(x);
        System.out.println("This is a rectangle with sides: " + x + ", " + y);
    }
}

public class SuperConstructorWithParam {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
    }
}
