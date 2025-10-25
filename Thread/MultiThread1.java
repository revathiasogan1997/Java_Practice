package Thread;

public class MultiThread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
	public static void main(String[] args) throws InterruptedException 
	{
		MultiThread1 mt1=new MultiThread1();
		MultiThread1 mt=new MultiThread1();
		mt1.start();
		mt1.getState();
		mt.join();
		mt1.join();
		System.out.println(mt1.isAlive());

	}

}
