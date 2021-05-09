import java.util.Scanner;
public class AreaOfRectangle
{
	public static void main(String args [])
	{
		double l,b,a;
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the length : ");
		l = sc.nextDouble();
		
		System.out.println("Enter the breath : ");
		b = sc.nextDouble();
		
		a = l * b;
		
		System.out.println("Area of Rectangle : "+a);
	}
}
