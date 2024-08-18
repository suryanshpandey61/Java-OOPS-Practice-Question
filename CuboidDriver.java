import java.util.Scanner;
class CuboidDriver
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Cuboid c1=new Cuboid();

    System.out.print("Enter length of cuboid==");
    double length=sc.nextDouble();

    System.out.print("Enter breadth of cuboid==");
    double breadth=sc.nextDouble();

    System.out.print("Enter height of cuboid==");
    double height=sc.nextDouble(); 

    c1.setValue(length,breadth,height);  

    c1.getVolume();
    c1.getArea();
    c1.getLsa();
    
  }

}