class A{
    A(){
        System.out.println("Inside default constructor");
    }
    A(int X){
    this();
    System.out.println("Paramertrized constructor invoked");
    System.out.println("X value is "+X);
    }
}
public class ThisConstructorDemo{
    public static void main(String args[]){
        A a=new A(4228);
    }
}