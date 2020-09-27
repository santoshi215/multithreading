package multithreds;

public class Join10 extends Thread{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		
		
		for(char c='A';c<='Z';c++)
		{
			System.out.print("  "+c);
			
		}
	}
	

}
