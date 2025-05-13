interface Math{

void add();
void diff();
void mul();
}
class Operation implements Math{
int a,b;
Operation(int a, int b){
this.a=a;
this.b=b;
}
public void add(){
System.out.println("Sum: " + (a+b));
}
public void diff(){
System.out.println("Difference: " + (a-b));
}
public void mul(){
System.out.println("Product: " + (a*b));
}
}

public class Inheriterface{
public static void main(String[] args){
Operation op = new Operation(10,8);
op.add();
op.diff();
op.mul();
}
}
