import java.io.*;
class CounterDemo{
  static int Count=0;
  CounterDemo(){
      Count++;
      System.out.println("Count="+Count);
  }
  }
  public class staticVariableDemo{
      public static void main(String args[]){
          CounterDemo cd=new CounterDemo();
          CounterDemo cd1=new CounterDemo();
          CounterDemo cd2=new CounterDemo();
      }
  }
