import java.util.*;
class ParameterisedConst{
int a,b;
ParameterisedConst(int x, int y){
a=x;
b=y;
}
void print(){
System.out.println(a+" "+b);
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers: ");
int a = sc.nextInt();
int b = sc.nextInt();
ParameterisedConst pc = new ParameterisedConst(a,b);
pc.print();
}
}
