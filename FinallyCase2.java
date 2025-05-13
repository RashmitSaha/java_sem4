class FinallyCase2{
public static void main(String[] args){
try{
int a=10, b=0;
System.out.println(a/b);
} finally{
System.out.println("Finally block executed.");
}
}
}
