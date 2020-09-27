package multithreds;

public class Thread1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread1 thread1=new Thread1();
		thread1.setName("thread1");
		Thread1 thread2=new Thread1();
		thread2.setName("thread2");
		thread1.start();
		thread2.start();
		
		for(int i=0;i<5;i++)
		{
		System.out.println("mainThread");
		}
	}

}
