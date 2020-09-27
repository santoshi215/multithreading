package multithreds;

public class Thread11 extends Thread{
	
	
	Message md;
	String name;
	
	Thread11(Message md,String name)
	{
		this.md=md;
		this.name=name;
	}
	public void run()
	{
		md.message(	name);
	}

}
