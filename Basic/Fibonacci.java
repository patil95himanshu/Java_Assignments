import java.util.Scanner;
class Fibonacci
{
	public static void main(String args [])
	{
		int n,n1=0,n2=1,temp,i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many fibonacci numbers you want:  ");
		n = sc.nextInt();
		
		System.out.println("The fibonacci numbers upto " + n + " are : "+n1 + " " + +n2);
		
		
		for (i=1;i<=n-2;i++)
		{
			temp=n1+n2;
			n1=n2;
			n2=temp;
			System.out.println(" "+temp);
		}	
	}
	
}
