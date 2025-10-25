package DeadLock;
			//My own practice//
class One
{
	synchronized void method1(Two ob)
	{
		System.out.println("Method 1 started");
		ob.method4();
	}
	synchronized void method2()
	{
		System.out.println("Method 2 started");

	}
}
class Two
{
	synchronized void method3(One obj)
	{
		System.out.println("Method 3 started");
		obj.method2();
	}
	synchronized void method4()
	{
		System.out.println("Method 4 started");
	}
}

class childlock extends Thread
{
	One ob;
	Two obj;
	childlock(One ob,Two obj)
	{
		this.ob=ob;
		this.obj=obj;
	}
	public void run()
	{
		obj.method3(ob);
	}
}
public class lock extends Thread
{
	One ob;
	Two obj;
	lock(One ob,Two obj)
	{
		this.ob=ob;
		this.obj=obj;
	}
	public void run()
	{
		ob.method1(obj);
	}
	public static void main(String[] args) 
	{
		One d=new One();
		Two d1=new Two();
		lock lock=new lock(d,d1);
		childlock cl=new childlock(d,d1);
		lock.start();
		cl.start();

	}

}
