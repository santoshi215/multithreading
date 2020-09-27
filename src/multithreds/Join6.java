package multithreds;

public class Join6 extends Thread{
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"->child thread");
			
		/*	if we want to wait for some time in thread child 
		 *  then we call slee().
		 * try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   */
		}
	}

}
