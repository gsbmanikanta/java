class Animal{
    String Name;
  void Eat(){
        System.out.println("I can eat");
    }
}
class JerryMouse extends Animal{
    public void display(){
     System.out.println("I Name is"+Name);   
    }
}
public class InheritanceDemo{
    public static void main(String args[]){
        JerryMouse JM=new JerryMouse();
        Animal A=new Animal();
        JM.Name="Jerry-TheMouse";
        JM.display();
        A.Eat();
    }
}