import java.io.*;
public class ArrayForEachDemo{
    public static void main(String args[]){
        int a[]={11,22,33,44,55};
        System.out.println("The elements of array are ");
        for(int i:a){
            System.out.print(a[i]+" ");
        }
    }
}
