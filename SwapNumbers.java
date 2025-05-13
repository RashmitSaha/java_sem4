import java.util.*;

class SwapNumbers{

int a,b;
void init(int a, int b){
this.a=a;
this.b=b;
}

void swapBitwise(){
a=a^b;
b=a^b;
a=a^b;
System.out.printf("Numbers after swapping: %d, %d\n",a,b);
}

void swapSingleLine(){
a=a^b^(b=a);
System.out.printf("Numbers after swapping: %d, %d",a,b);
}

public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("Enter the two numbers: ");
int a=in.nextInt();
int b=in.nextInt();

SwapNumbers swap = new SwapNumbers();
swap.init(a,b);
System.out.println("SWAPPING USING BITWISE OPERATOR");
swap.swapBitwise();
System.out.println("SWAPPING USING A SINGLE LINE STATEMENT");
swap.swapSingleLine();
}
}
