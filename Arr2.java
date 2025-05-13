import java.util.*;
class Arr2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int m,n;
System.out.println("Enter the dimensions of the array: ");
m=sc.nextInt();
n=sc.nextInt();
int arr[][]=new int[m][n];
System.out.println("Enter the elements: ");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
arr[i][j]=sc.nextInt();
}
}
System.out.println("The elements are: ");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
System.out.printf("arr[%d][%d]=%d\n",i,j,arr[i][j]);
}
}
}
}
