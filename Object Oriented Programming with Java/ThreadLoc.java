public class ThreadLoc
{
  public static void main (String[] args)
  {
    Tex t1 = new Tex("t1"), t2 = new Tex("t2");
    new Thread(t1).start();
    try
    {
      Thread.sleep(100);
    }
    catch (InterruptedException e)
    {}
    new Thread(t2).start();
    try
    {
      Thread.sleep(1000);
    }
    catch (InterruptedException e)
    {}
    t1.kill = true;
    t2.kill = true;
  }

  private static class Tex implements Runnable
  {
    final String name;
    Tex (String name)
    {
      this.name = name;
    }
    public boolean kill = false;
    public void run ()
    {
      TLocWrapper.get().tlint.set(System.currentTimeMillis());
      while (!kill)
      {
        
        System.out.println(name + ": " + TLocWrapper.get().tlint.get());
      }
    }
  }
}
class TLocWrapper
{
  public ThreadLocal<Long> tlint = new ThreadLocal<Long>();
  static final TLocWrapper self = new TLocWrapper();
  static TLocWrapper get ()
  {
    return self;
  }
  private TLocWrapper ()
  {
	  
  }
}
