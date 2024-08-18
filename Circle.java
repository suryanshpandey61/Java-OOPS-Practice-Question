class Circle
{
   double radius;
   
   public void setValue(double radius)
   {
     this.radius=radius;
   }
  


  public void getArea()
  {
    System.out.println("=================");
    double area = 3.14*radius*radius;
    System.out.println("Area of Circle is : "+area);
    
  }



  public void getCircumference()
  {
    double c = 2*3.14*radius;
    System.out.println("Circumferrance of circle : "+c);
    System.out.println("=================");
  }

}