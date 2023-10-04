import java.io.*;
import java.util.*;
public class PalindromeOfNumber{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a integer number : ");
       int n=sc.nextInt();
       int rev=0;   
       int i=n;     
       while(n!=0)
       {
         rev=(rev*10)+(n%10);
         n=n/10;
       }
       if(i==rev)
       {
         System.out.print(i+" is a palindrome");
       }
       else
       {
         System.out.print(i+" is not a palindrome");
       }
  }
}