package multithreds;

public class NumbersMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Number10 thread = new Number10();
		thread.setName("thread 1");
		thread.start();
		
		Alphabet threads = new Alphabet();
		threads.setName("thread 2");
		
		threads.start();
		threads.join();
		
		
		///System.out.println("main thread");
		
	}

}
