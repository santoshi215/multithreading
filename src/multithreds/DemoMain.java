package multithreds;

public class DemoMain {

	public static synchronized void main(String[] args) {
		
		DemoThread12 thread=new DemoThread12();
		thread.setName("tread 1 ");
		thread.start();
		
		DemoThread12 threado=new DemoThread12();
		threado.setName("thread 2 ");
		threado.start();
		
		for(int i=0;i<=5;i++)
			
		{
			System.out.println("this is main Thread");
		}
		
		
		
		
	}

}
