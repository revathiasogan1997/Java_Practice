package Thread;

class Two extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{	
			System.out.println("Second run method");
			System.out.println(Thread.currentThread().getName());
			System.out.println();
		}
	}
}
public class MultiThreadMethod extends Thread 
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{	
			System.out.println("First run method");
			System.out.println(Thread.currentThread().getName());
			System.out.println("-----");
		}
	}
	public static void main(String[] args) 
	{
		MultiThreadMethod mtm=new MultiThreadMethod();
		Two two=new Two();
//		mtm.setName("First thread");
//		two.setName("Second thread");
		mtm.setPriority(10);
		two.setPriority(10);
		mtm.start();
		two.start();
		System.out.println("Main Thread");
		System.out.println("How many threads are here: "+Thread.activeCount());
		mtm.setName("First thread");
		two.setName("Second thread");
		Thread.currentThread().setName("Main thread");
		System.out.println("Get thread name: "+mtm.getName());
		System.out.println("Get thread name: "+two.getName());
		System.out.println("Get thread name: "+Thread.currentThread().getName());
		
	}

}
