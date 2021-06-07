import java.util.*;
public class TestException
{
	static double amount = 34600.0;

	public static void withdrawAmount(double withdrawAmount) throws InsufficientBalanceException
	{
        if(amount < withdrawAmount){
      		throw new InsufficientBalanceException("Withdraw amount : "+withdrawAmount+" greater than Current Balance : "+amount);
      	}
        else{
      	amount = amount - withdrawAmount;
      	System.out.println("Your Account Current Balance is : "+amount);
      }
	}

	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Your Account Current Balance is : "+amount);
      System.out.println("Enter Balance to Withdraw : ");
      double withdrawAmount = sc.nextDouble();
      
      try
	  {
      	withdrawAmount(withdrawAmount);
      }
      catch(Exception e)
	  {
      	e.printStackTrace();
      }
      
	}
}
