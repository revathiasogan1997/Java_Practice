package InnerClass;
				//My own practice//
//Anonymous Class Creation
class One1
{
	void method()
	{
		System.out.println("Old version");
	}
}
abstract class Two2
{
	abstract void demo();
}

public class Task1 
{
	public static void main(String[] args) 
	{
		One1 ob=new One1()
				{
					void method()
					{
						System.out.println("New Version");
					}
				};
			ob.method();
		Two2 obj=new Two2()
				{
					@Override
					void demo() 
					{
						System.out.println("Abstract method");
					}
				};
			obj.demo();	
			
		Thread t=new Thread()
				{
					public void run()
					{
						System.out.println("Thread method");
					}
				};
			t.start();	
		Runnable r=new Runnable()	
				{
					@Override
					public void run()
					{
						System.out.println("Runnable interface");
					}
				};
			Thread t1=new Thread(r);
			t1.start();
				
	}

}
