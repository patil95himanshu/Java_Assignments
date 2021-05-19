import java.util.*;

class SquareRoot
{
	public static double squareRoot(double number)
	{
		double temp;
		double sr = number/2;
		
		do
		{
			temp=sr;
			sr=(temp +(number/temp))/2;
		}
		while((temp-sr)!=0);
		
		return sr;		
	}
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		
		double num=sc.nextDouble();
		
		System.out.println("Square root of "+ num +" is : "+squareRoot(num));
	}
}
