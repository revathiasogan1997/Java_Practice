package Task;

public class Test extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
			System.out.println("Daemon thread");
		else
			System.out.println("User thread");
	}
	public static void main(String[] args) 
	{
		Test t1=new Test();
		Test t2=new Test();
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}

}
