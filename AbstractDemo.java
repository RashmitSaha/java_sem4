abstract class Shape{
abstract void display();
}

class Rectangle extends Shape{
@Override
void display(){
System.out.println("This is a rectangle");
}
}

class Triangle extends Shape{
@Override
void display(){
System.out.println("This is a triangle");
}
}

public class AbstractDemo{
public static void main(String[] args){
Shape s1 = new Rectangle();
Shape s2= new Triangle();
s1.display();
s2.display();
}
}
