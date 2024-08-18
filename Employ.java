class Employ
{
  String emp_name;
  int id;
  int no_of_leave_days;
  int total_no_of_days;
  int per_day_sal;

  public void setDetails(String emp_name,int id,int no_of_leave_days,int total_no_of_days,int per_day_sal)
  {
    this.emp_name=emp_name;
    this.id=id;
    this.no_of_leave_days=no_of_leave_days; 
    this.total_no_of_days=total_no_of_days;
    this.per_day_sal=per_day_sal;
  }

  public void showDetails()
  {
    System.out.println("===============");
    System.out.println("Name of Employ is :"+emp_name);
    System.out.println("Id of Employ is : "+id);
  }

  public void actualSalary()
  {
    int actual_working_days = total_no_of_days - no_of_leave_days;
    int actual_sal=per_day_sal*actual_working_days;
    System.out.println("Actual salary of Employ is: "+actual_sal);
    System.out.println("===============");
  }

}