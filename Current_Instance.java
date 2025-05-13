class Current_Instance{
    int x; 

    public Current_Instance(int x) {
        System.out.println("Parameter x: " + x);  
        System.out.println("Instance x (before): " + this.x); 

        this.x = x; 

        System.out.println("Instance x (after): " + this.x);
    }

    public void display() {
        int x = 10; 
        System.out.println("Local x in display(): " + x); 
        System.out.println("Instance x in display(): " + this.x); 
    }

    public static void main(String[] args) {
        Current_Instance obj = new Current_Instance(5);
        obj.display(); 
    }
}
