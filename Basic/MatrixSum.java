import java.util.Scanner;
class MatrixSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int m = sc.nextInt();
		System.out.print("Enter no. of columns : ");
		int n = sc.nextInt();
		
		int[][] a = new int[m][n];
		int[][] b = new int[m][n];
		int[][] sum = new int[m][n];
		System.out.println("Enter elements of Matrix a ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements of Matrix b ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("Matrix a :");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");	
			}
			System.out.println();	
		}
		System.out.println("Matrix b :");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j]+" ");	
			}
			System.out.println();
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				sum[i][j] = a[i][j]+b[i][j];
			}
		}
		System.out.println("Matrix sum :");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(sum[i][j]+" ");	
			}
			System.out.println();
		}
	}
}
