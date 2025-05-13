import java.io.*;
class TakeInput1{
public static void main(String[] args) throws IOException{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a number: ");
String s = br.readLine();
int p = Integer.parseInt(s);

System.out.println("The number you entered is: " + p);
}
}
