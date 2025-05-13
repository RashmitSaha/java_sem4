class SumOfNaturalNumbers{

public static int add(int n){
int sum=0;
for(int i=1;i<=n;i++){
sum+=i;
}
return sum;
}

public static void main(String[] args){
int n = Integer.parseInt(args[0]);
int sumOfN = add(n);

System.out.println("Sum: " + sumOfN);
}
}

