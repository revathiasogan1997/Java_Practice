package Thread;

class MultiThread2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Runable Interface");
		}
	}
}
public class MultiThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{	
			System.out.println("Run method");
		}
	}
	public static void main(String args[])
	{
		MultiThread mt=new MultiThread();
				mt.start();
				for(int i=0;i<5;i++)
				{
					System.out.println("Main method");
				}
				MultiThread2 mt2=new MultiThread2();
				//Thread t=new Thread(mt2);
				//t.start();
				mt2.run();
	}
}
