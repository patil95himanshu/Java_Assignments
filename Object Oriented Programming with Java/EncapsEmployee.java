class EncapsulationDemo
{
    private int eid;
    private String empName;
    private int salary;

    
    public void setEmpSalary(int newValue)
	{
        salary = newValue;
    }

    public void setEmpName(String newValue)
	{
        empName = newValue;
    }

    public void setEmpID(int newValue)
	{
        eid = newValue;
    }
	public int getEmpID()
	{
        return eid;
    }

    public String getEmpName()
	{
        return empName;
    }
	public int getEmpSalary()
	{
		return salary;
	}
}
public class EncapsEmployee
{
    public static void main(String args[])
	{
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Pooja");
         obj.setEmpSalary(70000);
         obj.setEmpID(18);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee ID: " + obj.getEmpID());
         System.out.println("Employee Salary: " + obj.getEmpSalary());
    } 
}
