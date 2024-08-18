class Triangle
{
  double a;
  double b;
  double c;

  public void setValue(double a,double b,double c)
  {
    this.a=a;
    this.b=b;
    this.c=c;
  }

    public void getArea()
    {
      if((a+b>c) && (b+c>a) && (c+a>b))
      {
      double s=(a+b+c)/2;
      System.out.println("==================");
      double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("Area of Trianlge : "+area);
      }
      else
        {
       System.out.println("Can not form a valid triangle for area");
        }

    }
   public void getPerimeter()
   {
   if((a+b>c) && (b+c>a) && (c+a>b))
    {
      double perimeter=a+b+c;
      System.out.println("Perimeter of triangle :"+perimeter);
      System.out.println("==================");
    }
      else{
       System.out.println("Can not form a valid triangle perimeter");
        }  
     }
}