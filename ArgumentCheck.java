class CheckArgumentException extends Exception{
public CheckArgumentException(String message){
super(message);
}
}

class ArgumentCheck{
public static void main(String[] args){
try{
if(args.length < 5){
throw new CheckArgumentException("Less than 5 arguments.");
} else{
int sum=0;
for(int i=0;i<5;i++){
sum+=Integer.parseInt(args[i]);
}
System.out.println("Sum of first 5 arguments: " + sum);
}
} catch(CheckArgumentException e){
System.out.println("Error: " + e.getMessage());
}
}
}

