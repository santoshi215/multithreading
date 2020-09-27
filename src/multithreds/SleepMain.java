package multithreds;

public class SleepMain {

	public static void main(String[] args) {
		
		Sleep4  thread1 = new Sleep4();
		thread1.setName("thread 1-1");
		thread1.start();
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("main thread");
		}
				

	}

}
