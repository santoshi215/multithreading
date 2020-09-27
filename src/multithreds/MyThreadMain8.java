package multithreds;

public class MyThreadMain8 {

	public static void main(String[] args) {
		
		
		MyThread8 thread1=new MyThread8();
		MyThread8 thread2=new MyThread8();
		thread1.setName("1 thraed");
		thread1.start();
		
		thread2.setName("2 thraed");
		thread2.start();
		
		for(int i=0;i<=5;i++)
		{
		
			System.out.println("main thread");
		}
	}}


