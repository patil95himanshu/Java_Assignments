import java.util.Scanner;
public class Prime1toN 
{
	public static void main(String[] args) 
	{
		int a,x,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter a number : ");
		a=sc.nextInt();
		
		
		System.out.print("Prime numbers from 1 to "+a+" : ");
		for(j=2;j<=a;j++)
		{
			x=0;
			for(i=2;i<=j;i++)
				if(j%i==0)
						x++;
			if(x==1)
				System.out.print(j+"  ");
		}
		sc.close();
		
	}
}
