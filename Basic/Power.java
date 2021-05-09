import java.util.Scanner;
public class Power
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number : ");
		double n =sc.nextDouble();
		
		System.out.println("Please enter a power : ");
		double power =sc.nextDouble();
		
		System.out.println("\n "+n+"^"+power+" : "+Math.pow(n,power));
		sc.close();
	}
}
