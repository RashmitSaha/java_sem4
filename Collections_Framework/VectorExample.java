import java.util.*;
class VectorExample{
public static void main(String[] args){
Vector<Integer> v = new Vector<Integer>(15);

for(int i=0;i<2;i++){
v.add(i);
System.out.println(i + " added to the vector");
}
System.out.println("Vector: " + v);
System.out.println("Size of vector: " + v.size());

System.out.println("Converting to array: ");
Integer[] list = new Integer[v.size()];
v.copyInto(list);

for(int i=0;i<v.size();i++){
System.out.print(i + " ");
}
}
}
