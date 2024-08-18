class Cuboid
{
  double length;
  double breadth;
  double height;

  public void setValue(double length,double breadth,double height)
  {
    this.length=length;
    this.breadth=breadth;
    this.height=height;
  }

  public void getVolume()
  {
    System.out.println("==========");
    double volume=length*breadth*height;
    System.out.println("Volume of cuboid : "+volume);
  }

  public void getArea()
  {
    double area=2*((length*breadth)+(breadth*height)+(height*length));
    System.out.println("Area of cuboid is :"+area);
  }

  public void getLsa()
  {
    double lsa= 2*height*(length+breadth);
    System.out.println("LSA of cuboid is :"+lsa);
    System.out.println("==========");

  }
}