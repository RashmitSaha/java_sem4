import java.util.*;
class Array1{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter number of elements: ");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("The array elements are: ");
for(int i=0;i<n;i++){
System.out.printf("arr[%d]=%d\n",i,arr[i]);
}
}
}

