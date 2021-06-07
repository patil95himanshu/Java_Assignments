public class Bank
{
	private String bank_name;
	private int bank_ifsc_code;
	private String branch_location;
	private Customer customer;
	
	public Bank()
	{
	 
	}

	public Bank(String bname, int ifsc, String bLoc, Customer cust)
	{
	  bank_name=bname;
	  bank_ifsc_code=ifsc;
	  branch_location=bLoc;
	  customer = cust;
	}
    
    @Override
	public String toString()
	{
		return "\n Bank name : "+bank_name+"\n Bank ifsc code : "+bank_ifsc_code+"\n Branch Location : "+branch_location+"\n "+customer;
	}

}
