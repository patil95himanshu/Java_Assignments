public class Laptop
{
	protected int modelNo;
	protected  float price;
	protected long registerNo;
	protected String companyName;
	protected String modelName;

	protected void setModelNo(int modelNo)
	{
		this.modelNo = modelNo;
	}

    protected void setPrice(float price)
	{
		this.price = price;
	}

	protected void setRegisterNo(long registerNo)
	{
		this.registerNo = registerNo;
	}

	protected void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}

	protected void setModelName(String modelName)
	{
		this.modelName = modelName;
	}

	protected int getModelNo()
	{
		return modelNo;
	}

    protected float getPrice()
	{
		return price;
	}

	protected long getRegisterNo()
	{
		return registerNo;
	}

	protected String getCompanyName()
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
    
