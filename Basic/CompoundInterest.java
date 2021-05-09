import java.util.*;
public class CompoundInterest
{
	public static void main(String args [])
	{
		double p,n,r,ci;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Amount : ");
		p = s.nextDouble();
		
		System.out.println("Enter the No. of years : ");
		n = s.nextDouble();
		
		System.out.println("Enter the Rate of interest : ");
		r = s.nextDouble();
		
		ci = p * Math.pow(1.0 + r / 100.0, n) - p;
		
		System.out.println("Compound Interest : "+ci);
		
	}
} 
