package multithreds;

public class Table extends Thread{
	
	public synchronized void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*5);
		}
	}


}
