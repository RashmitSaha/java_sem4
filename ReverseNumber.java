import java.util.*;
class ReverseNumber{
public static int reverseOperations(int num){
int rev=0,digit;
while(num!=0){
digit=num%10;
rev=rev*10+digit;
num/=10;
}

return rev;
}

public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = in.nextInt();

int reversedNumber=reverseOperations(number);


System.out.println("Reverse: " + reversedNumber);
}
}
