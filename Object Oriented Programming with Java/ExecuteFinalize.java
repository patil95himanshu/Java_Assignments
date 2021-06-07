public class ExecuteFinalize
{

	@SuppressWarnings("deprecation")
	public void finalize()
	{
	  System.out.println("Finalize method called");
	}

	public static void main(String[] args)
	{
		System.out.println("By Using System.gc() : ");
		ExecuteFinalize ef = new ExecuteFinalize();
		ef=null;
		System.gc();
        
        System.out.println("By Using Runtime class calling gc() : ");
        Runtime r = Runtime.getRuntime();
        ExecuteFinalize ef1 = new ExecuteFinalize();
	    ef1=null;
	    r.gc();

		
		long freeMem = r.freeMemory();
		System.out.println("Checking Free Memory in Heap : "+freeMem);
		long totalfreeMem = r.totalMemory();
		System.out.println("Checking Total Free Memory : "+totalfreeMem);
	    
	    
	}


}
