class MyThread implements Runnable{
Thread t;
MyThread(){
t=new Thread(this,"Demo Thread");
System.out.println("Child Thread: " + t);
t.start();
}
public void run(){
for(int i=0;i<5;i++){
System.out.println("Child Thread: " + i);
}
}
public static void main(String[] args){
new MyThread();
}
}
