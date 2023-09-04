public class DemoPrimeV3 {
    public static void main(String args[]) {
     int num,flag=0,i;
     num=Integer.parseInt(args[0]);
      System.out.println("Enter an integer to check prime");
      
     for(i=2;i<=num/2;i++)
     {
         if(num%i==0)
         {
       flag=1;
       break;
         }
     }
     if(flag==0)
     { System.out.println(num+"It's a prime");
     }
     else
     {
         System.out.println(num+ "it's a prime");
     }
}
}