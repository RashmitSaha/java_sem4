class This_Argument{
int a,b;
This_Argument(int a, int b){
this.a=a; this.b=b;
}


public This_Argument GetInstance(){
return this;
}

void display(){
System.out.println(a+" "+b);
}

public static void main(String[] args){
This_Argument this3_1 = new This_Argument(100,200);
This_Argument this3_2 = this3_1.GetInstance();

this3_2.display();
}
}
