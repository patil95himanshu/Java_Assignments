public class AccessModifiersTest
{
	
	public static void main(String[] args)
	{
      Laptop lap = new Laptop(120,65000.0f,9158781153L,"ASUS","ROG STRIX");
      
      System.out.println(lap);
      
      System.out.println("modelNo var is private , Accessing through public method "+lap.getModelNo());
      
	}
}
    
