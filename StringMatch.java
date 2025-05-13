import java.util.*;
class NoMatchException extends Exception{
NoMatchException(String message){
super(message);
}
}

public class StringMatch{
String str;
StringMatch(String str){
this.str = str;
}
public static void main(String[] args){
try{
Scanner in = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = in.next();
StringMatch match = new StringMatch(str);
if(str.equals("India")){
System.out.println("So patriotic!");

} else{
throw new NoMatchException("Why are you so anti-Indian?");
}
} catch(NoMatchException e){
e.printStackTrace();
}
}
}
