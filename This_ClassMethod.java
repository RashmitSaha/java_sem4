class This_ClassMethod{
int x,y;
This_ClassMethod(int x, int y){
this.x=x;
this.y=y;
}
void display(){
this.print(); //invoked class method
}

void print(){
System.out.println(x+" "+y);
}

public static void main(String[] args){
This_ClassMethod this1 = new This_ClassMethod(10,20);
this1.display();
}
}
