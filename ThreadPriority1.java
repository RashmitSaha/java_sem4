class Thread1 extends Thread{
public void run(){
System.out.println("This is Thread1 class.");
}
}
class Thread2 extends Thread{
public void run(){
System.out.println("This is Thread2 class.");
}
}

public class ThreadPriority1{
public static void main(String s[]){
Thread1 t1 = new Thread1();
Thread2 t2 = new Thread2();
//t1.setPriority(Thread.MAX_PRIORITY);
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.MIN_PRIORITY);
//t1.run();
//t2.run();
Thread1.run();
Thread2.run();
}
}
