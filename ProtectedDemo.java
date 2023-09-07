import java.util.*;
class Sample{
    protected String Job;
}
public class ProtectedDemo extends Sample{
    public static void main(String args[]){
        Sample s=new Sample();
        s.Job="Studying";
        System.out.println("Job is "+s.Job);
    }
}
