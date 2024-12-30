public class TestEmployee
{
  public static void main(String[] args)
  {
    Employee employee = new Employee("A", 10.0, 14, false);
    employee.deserveBonus();
    employee.calculateSalary(8,5);
    employee.setWorkingYear(21);
    if(employee.getIsRetired() ==true)
    {
      System.out.println("True");
    }
    else
    {
      System.out.println("False");
    }
    
  }
}
