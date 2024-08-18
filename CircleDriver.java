import java.util.Scanner;
class CircleDriver
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     Circle c1=new Circle();
     Circle c2=new Circle();

     System.out.print("Enter the value of Radius of circle 1==");
     double r1=sc.nextDouble();
 
     System.out.println("=================");

     System.out.print("Enter the value of Radius of circle 2==");
     double r2=sc.nextDouble();

     
     c1.setValue(r1);
     c2.setValue(r2);

     c1.getArea();
     c1.getCircumference();

     c2.getArea();
     c2.getCircumference();

    
     
  }

}