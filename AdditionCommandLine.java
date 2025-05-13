class AdditionCommandLine{
int a,b;
void init(int a,int b){
this.a=a; this.b=b;
}
void add(){
System.out.println(a+b);
}
public static void main(String[] args){
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
AdditionCommandLine sum = new AdditionCommandLine();
sum.init(a,b);
sum.add();
}
}

