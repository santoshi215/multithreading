package multithreds;

public class Join10Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Join10 thraed = new Join10();
		thraed.start();
		thraed.setName("thread1");

		thraed.join();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("  "+i);
		}
	}

}
