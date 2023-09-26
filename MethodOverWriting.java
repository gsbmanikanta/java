import java.io.*;
class Bank{
    int getRateofInterest()
    {
        return 0;
    }
}
class SBI extends Bank{
    int getRateofInterest()
    {
        return 8;
    }
}
class HDFC extends Bank{
    int getRateofInterest()
    {
        return 9;
    }
}
class UnionBank extends Bank{
    int getRateofInterest()
    {
        return 10;
    }
}
public class MethodOverWritingDemo{
    public static void main(String args[]){
        SBI S= new SBI();
        HDFC H= new HDFC();
        UnionBank U= new UnionBank();
        System.out.println("SBI Rateofinterest is "+S.getRateofInterest());
        System.out.println("HDFC Rateofinterest is "+H.getRateofInterest());
        System.out.println("Union Rateofinterest is "+U.getRateofInterest());
        
    }
}