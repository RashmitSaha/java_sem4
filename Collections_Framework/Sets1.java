import java.util.*;

public class Sets1{
public static void main(String[] args){
Set<String> set1 = new HashSet<String>();
set1.add("a");
set1.add("b");
set1.add("c");
System.out.println("Set created. Set: " + set1);
set1.remove("c");
System.out.println("c removed from Set. Set: " + set1);
System.out.println("Size of set: " + set1.size());
set1.add("a");
System.out.println("A added to set. Size of set after adding: " + set1.size());

System.out.println("Does Set1 contain a?");

//System.out.println("Answer: " + set1.isContains("a"));
//isContains() does not exist, so it will provide error.

System.out.println("Answer: " + set1.contains("a"));
}
}
