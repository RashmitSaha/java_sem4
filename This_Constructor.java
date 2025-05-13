class This_Constructor{
int a,b;
This_Constructor(int a, int b){
this.a=a; this.b=b;
}
This_Constructor(int a){
this(a,50);
}
This_Constructor(){
this(10,20);
}
void display(){
System.out.println(a+" "+b);
}

public static void main(String[] args){
This_Constructor this2_1 = new This_Constructor(50,100);
This_Constructor this2_2 = new This_Constructor(30);
This_Constructor this2_3 = new This_Constructor();
this2_1.display();
this2_2.display();
this2_3.display();
}
}
