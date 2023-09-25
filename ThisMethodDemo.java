class A{
    void M(){
        System.out.println("Inside Method M");
    }
    void N(){
    System.out.println("Inside Method N");
    this.M();
    }
}
public class ThisMethodDemo{
    public static void main(String args[]){
        A a=new A();
        a.N();
    }
}