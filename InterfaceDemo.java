interface Shape{
void display();
}

class Rectangle implements Shape{
@Override
public void display(){
System.out.println("This is a rectangle");
}
}

class Triangle implements Shape{
@Override
public void display(){
System.out.println("This is a triangle");
}
}

public class InterfaceDemo{
public static void main(String[] args){
Shape s1 = new Rectangle();
Shape s2= new Triangle();
s1.display();
s2.display();
}
}
