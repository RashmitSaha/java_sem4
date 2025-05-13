final class A{
int x=10;
void display(){
System.out.println(x);
}
}
/*class B extends A{
int y=20;
void display(){
System.out.println(y);
}
}*/
public class FinalClass{
public static void main(String[] args){
//B obj = new B();
A obj = new A();
obj.display();
}
}
