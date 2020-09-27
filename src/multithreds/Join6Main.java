package multithreds;

public class Join6Main {

	public static void main(String[] args) throws InterruptedException //main thread is
	{                             //is calling join method on thread1 to give chance
		                          //to execute thread1
		Join6 thread1 =new Join6();
		thread1.setName("1st threAd");
		thread1.start();
		thread1.join(5000);
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("two threads main and child thread.");
		}
	}

}
