package Synchronization;


class Web
{
	static synchronized void show(String name)
	{
		for(int i=0;i<1;i++)
		{
			System.out.print("Welcome ");
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
class User1 extends Thread
{
	Web ob;
	String name;
	User1(Web ob,String name)
	{
		this.ob=ob;
		this.name=name;
	}
	public void run()
	{
		//Web ob=new Web();
		ob.show(name);
	}
}
public class Synch 
{
	public static void main(String[] args)
	{
//		Web ob=new Web();
//		User1 obj=new User1(ob,"User1");
//		User1 obj1=new User1(ob,"User2");
//		User1 obj2=new User1(ob,"User3");
//		obj.start();
//		obj1.start();
//		obj2.start();
		
//		Web ob=new Web();
//		Web ob1=new Web();
//		Web ob2=new Web();
//		User1 obj=new User1(ob,"User1");
//		User1 obj1=new User1(ob1,"User2");
//		User1 obj2=new User1(ob2,"User3");
//		obj.start();
//		obj1.start();
//		obj2.start();
		
		Web ob=new Web();
		User1 obj=new User1(ob,"user");
		User1 obj1=new User1(ob,"user");
		obj.start();
		
	
	}

}
