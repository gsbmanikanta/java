import java.io.*;
class Student{
    int rollnumber;
    String name;
    static String college = "SITE";
    Student(int r,String n){
        rollnumber=r;
        name=n;
    }
    void display(){
        System.out.println(rollnumber+" "+name+" "+college);
    }
}
public class staticVariableDemo{
    public static void main(String args[]){
        Student S1=new Student(228,"Manikanta");
        Student S2=new Student(255,"Gopi");
        System.out.println("The students details are : ");
        S1.display();
        S2.display();
    }
}