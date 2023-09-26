import java.io.*;
abstract class Animal{
    public abstract void AnimalSound();
    public void Sleep(){
        System.out.println("zzz");
    }
}
class cow extends Animal{
    public void AnimalSound(){
    System.out.println("The cow sounds maa");
    }
}
public class AbstractionDemo{
    public static void main(String args[]){
        cow c= new cow();
        c.AnimalSound();
        c.Sleep();
    }
}