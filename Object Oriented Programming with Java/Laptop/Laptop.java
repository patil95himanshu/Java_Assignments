public class Laptop
{
	private int modelNo;
	float price;
	protected long registerNo;
	public String companyName;
	protected String modelName;

	public Laptop()
	{

	}

	public Laptop(int modelNo, float price, long registerNo, String companyName, String modelName)
	{
		this.modelNo = modelNo;
		this.price = price;
		this.registerNo = registerNo;
		this.companyName = companyName;
		this.modelName = modelName;
	}

	public Laptop(float price, long registerNo, String companyName, String modelName)
	{
		this.price = price;
		this.registerNo = registerNo;
		this.companyName = companyName;
		this.modelName = modelName;
	}

	public void setModelNo(int modelNo)
	{
		this.modelNo = modelNo;
	}

    protected void setPrice(float price)
	{
		this.price = price;
	}

	void RegisterNo(long registerNo)
	{
		this.registerNo = registerNo;
	}

	private void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}

	protected void setModelName(String modelName)
	{
		this.modelName = modelName;
	}

	public int getModelNo()
	{
		return modelNo;
	}

    protected float getPrice()
	{
		return price;
	}

	public long getRegisterNo()
	{
		return registerNo;
	}

	private String getCompanyName()
	{
		return companyName;
	}

	protected String getModelName()
	{
		return modelName;
	}

	public String toString(){
		return "\n Model Number : "+modelNo+"\n Price : "+price+"\n Register Number : "+registerNo+"\n Company Name : "+companyName+"\n Model Name : "+modelName;
	}

}
    
