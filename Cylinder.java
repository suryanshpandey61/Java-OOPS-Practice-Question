class Cylinder
{
  double radius;
  double height;
 
  public void setValue(double radius,double height)
  {
    this.radius=radius;
    this.height=height;
  }

  public void getArea()
  {
    System.out.println("=================");
    double area = 2*3.14*radius*(radius+height);
    System.out.println("Area of Cylinder is : "+area);
  }

  public void getCsa()
  {
    double csa = 2*3.14*radius*height;
    System.out.println("Curved Surface Ares : "+csa);
  }

  public void getVolume()
  {
    double volume=3.14*radius*radius*height;
    System.out.println("Volume of cylinder is :"+volume);
    System.out.println("=================");
  }
}