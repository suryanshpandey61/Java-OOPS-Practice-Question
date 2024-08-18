import java.util.Scanner;
class RectangleDriver
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    Rectangle r1=new Rectangle();
    Rectangle r2=new Rectangle();
    Rectangle r3=new Rectangle();
    Rectangle r4=new Rectangle();
    
    System.out.print("Enter the r1 length ==");
    double a=sc.nextDouble();
    System.out.print("Enter the r1 width ==");
    double b=sc.nextDouble();


    System.out.println("========================");

    System.out.print("Enter the r2 length ==");
    double x=sc.nextDouble();
    System.out.print("Enter the r2 width ==");
    double y=sc.nextDouble();


    System.out.println("========================");



    r1.setValue(a,b);
    r1.getArea();
    r1.getPerimeter();

    r2.setValue(x,y);
    r2.getArea();
    r2.getPerimeter();
    
  }
}