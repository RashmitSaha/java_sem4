interface Shape{
    void display();
}

interface Calculate{
    void calc();
}

class Rectangle implements Shape,Calculate{
int l,b;
Rectangle(int l, int b){
this.l=l;
this.b=b;
}
    @Override
    public void display() {
        System.out.println("This is a rectangle");
    }

    @Override
    public void calc() {
        System.out.println("Area: "+ l*b);
        System.out.println("Perimeter: " + 2*(l+b));
    }
}

public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        Rectangle s = new Rectangle(10,8);
        s.display();
        s.calc();
}
}
