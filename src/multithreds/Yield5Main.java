package multithreds;

public class Yield5Main {

	public static void main(String[] args) {
		
		Yield5 thread1 =new Yield5();
		thread1.setName("1st thraed");
		thread1.start();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("main thrad executing.");
		}
	}

}
