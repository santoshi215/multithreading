package multithreds;

public class Sleep4 extends Thread{
	
	
	public void run()
	{
		try
		{
		for(int i=0;i<=4;i++)
			{
			System.out.println(Thread.currentThread().getName());
			
			Thread.sleep(5000);
			} 
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}


