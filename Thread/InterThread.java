package Thread;

import java.util.*;
class Shop
{
	Scanner sc=new Scanner(System.in);
	int bags=20;
	synchronized void Order(int CountOfOrder)
	{
//		System.out.println("How bags are you wanted:");
//		CountOfOrder=sc.nextInt();
		if(bags>=CountOfOrder)
		{
			System.out.println("Order Successfull");
			bags-=CountOfOrder;
			System.out.println("Loaded Total Bages: "+bags);
		}
		else
		{
			try 
			{
				System.out.println("Out of stock");
				wait();
				//Load(CountOfOrder);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("Order Successfull After Loading");
			bags-=CountOfOrder;
			System.out.println("Remaining Bages: "+bags);
		}
	}
	synchronized void Load(int CountOfLoad)
	{
		bags+=CountOfLoad;
		System.out.println("Load the stock: ");
		System.out.println("Total bags: "+bags);
		notify();//Notifying the waiting of order
	}
}
class Shopping extends Thread
{
	Shop ob;
	Shopping(Shop ob)
	{
		this.ob=ob;
	}
	public void run()
	{
		ob.Order(50);
	}
}
public class InterThread extends Thread
{
	Shop ob;
	InterThread(Shop ob)
	{
		this.ob=ob;
	}
	public void run()
	{
		ob.Load(100);
	}
	public static void main(String[] args)
	{
		Shop ob=new Shop();
		Shopping obj=new Shopping(ob);
		InterThread obj1=new InterThread(ob);
		obj.start();
		obj1.start();
		obj.setName("Shopping");
		obj.getName();
		
		
	}

}
