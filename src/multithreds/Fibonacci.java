package multithreds;


public class Fibonacci extends Thread {
	
	
	public synchronized void run()	
	{
		
		//Scanner sc=new Scanner(System.in);
		int num=50;int no1=0;int no2=1;int result;
		
		/*System.out.println("enter the  number upto display series:");
		num=sc.nextInt();*/
		
	//	System.out.print(no1+"	 "+no2);

	for(int i=0;i<=num;i++)
	{
		result=no1+no2;
		no1=no2;
		no2=result;
		System.out.print("	 "+result);
	}
}}
