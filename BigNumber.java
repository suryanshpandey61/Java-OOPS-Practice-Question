import java.util.Scanner;
class BigNumber
{
   public static int BigDigit(int a,int b)
   {
      if(a>b)
       {
         return a;
       }
      else
      {
         return b;
      }
   }
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the value of first number==");
     int a=sc.nextInt();
     System.out.print("Enter the value of second number==");
     int b=sc.nextInt();
     int bigNumber=BigDigit(a,b);
     System.out.println("Big number in " +a+ " and " +b+ " is: "+bigNumber);
   }
}