package multithreds;

public class Number extends Thread{
	
	public synchronized void run()
	{
		String s[]=new String[7];
		
		 s[0]="sunday";
		 s[1]="munday";
		 s[2]="tuesday";
		 s[3]="wednesday";
		 s[4]="thursday";
		 s[5]="friday";
		 s[6]="saturday";
		 
		for(int i=0;i<=6;i++)
		{
			System.out.println(s[i]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}

}}
