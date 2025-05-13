class MethodOverloading{

void add(int a){
System.out.println(a+2);
}
void add(int a, int b){
System.out.println(a+b);
}
void add(double a, double b){
System.out.println(a+b);
}
void add(String a, String b){
System.out.println(a+b);
}

public static void main(String[] args){
MethodOverloading mo=new MethodOverloading();
mo.add(5);
mo.add(5,6);
mo.add(3.0,5.0);
mo.add("hello","world");
}
}
