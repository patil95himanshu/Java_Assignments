class MultipleThread
{  
 public static void main(String args[])
 {  
  Runnable r1=new Runnable()
  {  
    public void run(){  
      System.out.println("task one");  
  }  
 };  
  
  Runnable r2=new Runnable()
  {  
    public void run()
	{  
      System.out.println("task two");  
	}  
  };  
  Runnable r3=new Runnable()
  {  
    public void run()
	{  
      System.out.println("task three");  
    }  
  };  
      
  Thread t1=new Thread(r1);  
  Thread t2=new Thread(r2);  
   Thread t3=new Thread(r3);  
  
  t1.start();  
  t2.start();  
  t3.start();  
 }  
}
