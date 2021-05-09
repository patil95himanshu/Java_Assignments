import java.util.Scanner;
public class Prime1toN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int a=sc.nextInt();
		
		int x;
		System.out.print("Prime numbers from 1 to "+a+" : ");
		for(int j=2;j<=a;j++)
		{
			x=0;
			for(int i=2;i<=j;i++)
				if(j%i==0)
						x++;
			if(x==1)
				System.out.print(j+"  ");
		}
		sc.close();
		
	}
}
