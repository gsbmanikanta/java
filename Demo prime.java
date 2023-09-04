import java.*;
import java.util.*;
public class DemoPrime {
    public static void main(String args[]) {
     int num=45,flag=0,i;
     for(i=2;i<=num/2;i++)
     {
         if(num%i==0)
         {
      System.out.println(num+ "it's not a prime");
       flag=1;
       break;
         }
     }
     if(flag==0)
     {
         System.out.println(num+ "it's a prime");
     }
}
}