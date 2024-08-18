class Rectangle
{
  double length;
  double width;
  
  public void setValue(double length,double width)
  {
    this.length=length;
    this.width=width;
  }
  
  public void getArea()
  {
    double area=length*width;
    System.out.println("Area of Rectangle is : "+area);
  }

  public void getPerimeter()
  {
    double perimeter=2*(length+width);
    System.out.println("Perimeter of Reactangle is : "+perimeter);
  }


}