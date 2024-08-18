import java.util.Scanner;
class CylinderDriver
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    Cylinder c1= new Cylinder();
    Cylinder c2= new Cylinder();  
  
    System.out.print("enter value of radius of cylinder 1=");
    double r1=sc.nextDouble();
    System.out.print("enter value of height of cylinder 1=");
    double h1=sc.nextDouble();
 
    System.out.print("enter value of radius of cylinder 2=");
    double r2=sc.nextDouble();
    System.out.print("enter value of height of cylinder 2=");
    double h2=sc.nextDouble();

    c1.setValue(r1,h1);
    c2.setValue(r2,h2);

    c1.getArea();   
    c1.getCsa();   
    c1.getVolume();

    c2.getArea();   
    c2.getCsa();   
    c2.getVolume();
  }
}