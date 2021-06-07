class ArrayEmp
{
   public static void main(String args[]){
     
    Employee[] obj = new Employee[2] ;
 
     
     obj[0] = new Employee(108,"Pooja",70000);
     obj[1] = new Employee(102,"Himanshu",70000);
 
     
     System.out.println("Employee Object 1:");
     obj[0].showData();
	 System.out.println();
     System.out.println("Employee Object 2:");
     obj[1].showData();
	 System.out.println();

	 
  }
}

class Employee
{
  int empId;
  String name;
  int salary;
 Employee(int eid, String n, int s)
 {
     empId = eid;
     name = n;
	 salary=s;
  }
public void showData(){
   System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name + "  "+ "Employee Salary = "+salary);
   System.out.println();
 }
}
