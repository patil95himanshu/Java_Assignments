import java.util.*;

public class Employee1
{
	private int eid;
	private String ename;
	private double salary;
	
	public void setEmployee1(int eid,String ename,double salary)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
	}
	public void getEmployee1()
	{
		System.out.println("Eid:"+eid);
		System.out.println("Name:"+ename);
		System.out.println("Salary:"+salary);
    }

}
