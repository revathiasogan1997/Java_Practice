package Task;

class A
{
	synchronized void methodA(B b)
	{
		System.out.println("Thread starts execution of methodsA");
		b.last();
	}
	
	synchronized void last()
	{
		System.out.println("Inside ALast");
	}
}
class B
{
	synchronized void methodB(A a)
	{
		System.out.println("Thread starts execution of methodsA");
		a.last();
	}
	synchronized void last()
	{
		System.out.println("Inside ALast");
	}
}
public class Deadlock implements Runnable
{
		A a=new A();
		B b=new B();
		Deadlock()
		{
			Thread t=new Thread(this);
			t.start();
			a.methodA(b);
		}
		public void run()
		{
			b.methodB(a);
		}
		public static void main(String[] args) 
		{
			new Deadlock();
		}
}
