package multithreds;

public class DemoMain9 {

	public static void main(String[] args) {
		
		Number thread =new Number();
		thread.setName("thread1");
		thread.start();
		
		
		Table threadtable= new Table();
		threadtable.setName("thread2");
		threadtable.start();
		
		Fibonacci  threadf=new Fibonacci();
		threadf.setName("thread 3");
		threadf.start();
		
		for(int i=0;i<=2;i++)
		{
			System.out.println("this is main thread.");
		}
		

	}

}
