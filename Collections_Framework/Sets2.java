import java.util.*;

public class Sets2{
public static void main(String[] args){
//Set<String> set2 = new Set<String>("a","b","c");
//Since Set is an interface, we can't create an instance of it directly. So, we use dynamic method dispatch to create a set object. The class which is implemented by the Set interface is the HashSet class.
Set<String> set2 = new HashSet<String>();
set2.add("a");
set2.add("b");
set2.add("c");
System.out.println("Set2: " + set2);
Set<String> set3 = new HashSet<String>();
set3.add("x");
set3.add("y");
set3.add("z");
System.out.println("Set3: " + set3);
//set3.add(set2);
//add() method of Set<E> gives us an argument mismatch error since it expects String argument. So, we use addAll() instead to merge set2 and set3.
set3.addAll(set2);
System.out.println("Set3 after merging with Set2: " + set3);
set3.removeAll(set2);
System.out.println("Set3 after removing elements from Set2: " + set3);
set3.addAll(set2);
set3.retainAll(set2);
System.out.println("Set3 after removing all elements except Set2 elements: " + set3);
}
}
