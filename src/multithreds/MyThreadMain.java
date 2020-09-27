package multithreds;

public class MyThreadMain {

	public static void main(String[] args) {
		
		MyThread3 thread1 = new MyThread3();
	
		thread1.setName("thread 1");
		System.out.println("thread1 priority is:"+thread1.getPriority());
		thread1.start();
		MyThread3 thread2 = new MyThread3();
		
		thread2.setName("thread 2");
		thread2.setPriority(10);
		System.out.println("thread2 priority is:"+thread2.getPriority());
		thread2.start();
		
		System.out.println("main thread priority is:"+Thread.currentThread().getPriority());
		for(int i=0;i<=2;i++)
		{
			System.out.println("this is main method.");
		}
	
	}

	
}
