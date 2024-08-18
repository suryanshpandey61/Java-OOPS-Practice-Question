import java.util.Scanner;
class TrianlgeDriver
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     Triangle t1=new Triangle();
     Triangle t2=new Triangle();

     System.out.print("Enter the value of 1st side==");
     double a1=sc.nextDouble();

     System.out.print("Enter the value of 2nd side==");
     double b1=sc.nextDouble();

     System.out.print("Enter the value of 3rd side==");
     double c1=sc.nextDouble();

     System.out.println("ENter details of  second triangle");

     System.out.print("Enter the value of 1st side==");
     double a2=sc.nextDouble();

     System.out.print("Enter the value of 2nd side==");
     double b2=sc.nextDouble();

     System.out.print("Enter the value of 3rd side==");
     double c2=sc.nextDouble();

     t1.setValue(a1,b1,c1);
     t2 .setValue(a2,b2,c2);


     t1.getArea();
     t1.getPerimeter();

     t2.getArea();
     t2.getPerimeter();

    

     
  } 
}