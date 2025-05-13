class ReturnValue{
    public String name="Tom";
    public String getName(){
        return name;
    }
    public static void main(String[] args){
        ReturnValue rv=new ReturnValue();
        String name = rv.getName();
        System.out.println("Name is: "+name);
    }
}