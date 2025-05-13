class ConstructorOverload{
int a,b;
ConstructorOverload(){
a=5;
b=10;
System.out.println(a+" "+b);
}
/*ConstructorOverload(int x, int y){
a=x;
b=y;
}
ConstructorOverload(ConstructorOverload co){
co.a=a;
co.b=b;
}*/

void display(){
System.out.println(a+" "+b);
}

public static void main(String[] args){
ConstructorOverload co1=new ConstructorOverload();
/*ConstructorOverload co2=new ConstructorOverload(10,20);
ConstructorOverload co3=new ConstructorOverload(co1);*/
co1.display();
/*co2.display();
co3.display();*/
}
}
