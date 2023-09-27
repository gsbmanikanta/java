import java.io.*;
public class Calculate{
    static int cube(int x){
        return x*x*x;
    }
    public static void main(String args[]){
        int result = cube(2);
        System.out.println("cube of 2 is "+result);
    }
}
