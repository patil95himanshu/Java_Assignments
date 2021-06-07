import java.io.*;
import java.util.*;

public class MultiThreadByAnnonymousInnerClass
{
	 public static void main(String[] args) throws IOException
    {
        new Thread()
		{
          public void run()
		  {
            for(int i=0; i<100; i++)
			{
                Thread.currentThread().setName("ByThreadClass");
                System.out.println(Thread.currentThread().getName()+"--"+i);
            }
          }
        }.start();


        new Thread(new Runnable()
		{
            @Override
            public void run()
			{
            for(int i=0; i<100; i++)
			{
                Thread.currentThread().setName("ByRunnableInterface");
                System.out.println(Thread.currentThread().getName()+"--"+i);
            }
          }

        }){
          
        }.start();

        new Thread(new Runnable()
		{
            @Override
            public void run()
			{
                for (int i = 0; i < 100; i++)
				{
                    Thread.currentThread().setName("ByRunnable");
                    System.out.println("java"+"--"+i);
                }
            }
        }){
            public void run()
			{
                for (int i = 0; i < 100; i++)
				{
                    Thread.currentThread().setName("ByThread");
                    System.out.println("hello"+"--"+i);
                }
            }
        }.start();


    }
}
