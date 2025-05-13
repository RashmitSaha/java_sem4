class A{
int a,b;
A(){
a=10; b=20;
}
void sum(){
int c = a+b;
}
void  diff(){
int d=a-b;
}
}

class B extends A{

void display(){
System.out.println("Sum: "+c);
System.out.println("Difference: "+d);
}
}

public class SingleInheritance{
public static void main(String[] args){
B ob = new B();
ob.sum();
ob.diff();
ob.display();
}
}
