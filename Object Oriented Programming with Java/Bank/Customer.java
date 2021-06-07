public class Customer
{
	private String cust_name;
	private long cust_acc_no;
	private String cust_dob;
	private long cust_mobile_no;

	public Customer(String name, long accNo, String dob, long moNo)
	{
	 cust_name=name;
	 cust_acc_no=accNo;
	 cust_dob=dob;
	 cust_mobile_no=moNo;
	}
    
    @Override
    public String toString()
    {
    	return "\n Customer name : "+cust_name+"\n Account Number : "+cust_acc_no+"\n Customer DOB : "+cust_dob+
    		               "\n Customer Mobile No : "+cust_mobile_no;
    }

	
}
