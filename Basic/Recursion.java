public class Recursion //Fibonacci series using recursion
{
	static int num1=0,num2=1,num3=0;
	static void fibonacci(int n)
	{
	if(n>0){
	num3 = num1 + num2;
	num1 = num2;
	num2 = num3;
	System.out.print(" "+num3);
	fibonacci(n-1);
	}
}

	public static void main(String args[])
	{
	int n=10;
	System.out.print(num1+" "+num2);
	fibonacci(n-2);
	}
}
