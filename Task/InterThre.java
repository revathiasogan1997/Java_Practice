package Task;

class Shared 
{
	synchronized void test() throws InterruptedException
	{
		System.out.println("Waiting");
		wait();
		System.out.println("Notify");
	}
	synchronized void done()
	{
		notify();
	}
}

public class InterThre 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Shared s=new Shared();
		new Thread(()->
		{
			try
			{
				s.test();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}).start();
		Thread.sleep(1000);
		s.done();
	}

}
