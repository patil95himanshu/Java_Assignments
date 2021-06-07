public class AccessProtectedTest
{
	
	public static void main(String[] args)
	{
      Laptop l = new Laptop();
      l.setModelNo(102);
      l.setRegisterNo(1212123L);
      l.setPrice(650000f);
      l.setCompanyName("ASUS");
      l.setModelName("ASUS ROG STRIX");
      System.out.println(l);
	}
}
    
