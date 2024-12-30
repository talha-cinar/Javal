public class Employee
{
  private String essn;
  private double pricebyHour;
  private int workingYear;
  private boolean isRetired;

  public Employee(String essn, double pricebyHour, int workingYear, boolean isRetired)
  {
    this.essn = essn;
    this.pricebyHour = pricebyHour;
    this.workingYear = workingYear;
    this.isRetired = isRetired;
  }

  public int getWorkingYear()
  {
    return workingYear;
  }

  public boolean getIsRetired()
  {
    return isRetired;
  }

  public void setIsRetired(boolean isRetired)
  {
    this.isRetired = isRetired;
  }

  public void setWorkingYear(int workingYear)
  {
    this.workingYear = workingYear;
    if(20 <= workingYear)
    {
      Retiring();
    }
  }

  public void Retiring()
  {
    this.isRetired = true;
  }

  public boolean deserveBonus()
  {
    if(10 <= getWorkingYear())
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public double calculateSalary( int workingHour, int workingDays)
  {
    return workingHour * workingDays * pricebyHour; 
  }
}
