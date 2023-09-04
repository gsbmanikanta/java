import java.util.*;
public class DemoPrimeV4{
    public static void main(String args[]) {
      int num,flag,i,j;
      System.out.print("Enter a integer to check prime under it : " );
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      System.out.print("The list of prime numbers from 2 to "+num+" are:");
      for(i=2;i<=num;i++)
      {
          flag=0;
          for(j=2;j<=num;j++)
          {
              if(i%j==0)
             {
                flag=flag+1;
              }
          }
         if(flag==1)
         {
          System.out.print(i+" ");
         }
      }
    }
}