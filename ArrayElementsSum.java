import java.io.*;
import java.util.*;
public class ArrayElementsSum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Sum=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+"values into array");
        for(int i:a)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            Sum= Sum+a[i];
        }
        System.out.println("Sum of given elements is"+Sum);
    }
}