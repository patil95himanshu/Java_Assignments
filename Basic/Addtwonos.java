import java.util.Scanner;
public class Addtwonos 
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		
    		System.out.println("Enter the first number : ");
			double a = sc.nextDouble();
		
    		System.out.println("Enter the Second Number : ");
			double b = sc.nextDouble();
		
    		double result = a+b;
			System.out.println("The sum of the given two numbers are : "+result);
	}
}
