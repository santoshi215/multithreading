package multithreds;

public class Thread11Main {

	public static void main(String[] args) //throws InterruptedException {
								//we need to throw excn only if we call sleeep()
	{

		Message md = new Message();
		Message md1 = new Message();
		
		Thread11 thread1 = new Thread11(md, "Priya");
		Thread11 thread2 = new Thread11(md1, "Rahul");
		Thread11 thread3 = new Thread11(md1, "Sonia");
		
		//Thread.sleep(5000);//if we want we can add otherwise no need
		for(int i=0;i<5;i++)
		{
			System.out.println("mainthraead");
		}
		
		
		
		thread1.start();
		thread2.start();
		thread3.start();


	}

}
