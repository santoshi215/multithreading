package multithreds;

public class MyThread3 extends Thread{

	public void run()
	{
		for(int i=0;i<=1;i++)
		{
			System.out.println(Thread.currentThread().getName()+"-->santu");
		}	
	}
	
}
