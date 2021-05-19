import java.util.*;

class StudentsGrades
{
	public static void main(String args [])
	{
		double marks;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Student's marks : ");
		marks=sc.nextDouble();
		
		if(marks>=75 && marks<=100)
		{
			System.out.println("The Student's Grade is A ");
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("The Student's Grade is B ");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("The Student's Grade is C ");
		}
		else if(marks>=40 && marks<50)
		{
			System.out.println("The Student's Grade is D ");
		}
		else
		{
			System.out.println("The Student has Failed : ");
		}
	}
}
