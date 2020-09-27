package multithreds;

public class Yield5 extends Thread{
	
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"---->child thread");
			Thread.yield();
		}
	}

	
	
}
