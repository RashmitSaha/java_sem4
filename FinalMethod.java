class A{
int x=10;
final void display(){
System.out.println(x);
}
}
class B extends A{
int y=20;
/*void display(){
System.out.println(y);
}*/
}
public class FinalMethod{
public static void main(String[] args){
B obj = new B();
obj.display();
}
}
