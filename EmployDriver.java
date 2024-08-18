import java.util.Scanner;
class EmployDriver
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Employ e1= new Employ();
   
    System.out.print("Enter the name of employ==");
    String name=sc.nextLine();
   
    System.out.print("Enter the id:==");
    int id=sc.nextInt();

    System.out.print("Enter no of leave  days==");
    int no_of_working_days=sc.nextInt();

   System.out.print("Enter Total no of days==");
   int total_no_of_days=sc.nextInt();
 
   System.out.print("Enter per day salary ==");
   int per_day_sal=sc.nextInt();

   e1.setDetails(name,id,no_of_working_days,total_no_of_days,per_day_sal);
   e1.showDetails();
   e1.actualSalary();
  }
}