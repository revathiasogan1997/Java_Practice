package Synchronization;

import java.util.Scanner;

public class Order 
{
	Scanner sc=new Scanner(System.in);
	int bags=20,POrder;
	public void ProductOrder()
	{
		System.out.println("How many items are wanted:");
		POrder=sc.nextInt();
		if(bags>=POrder)
		{
			System.out.println("Order Successfully");
		}
		else
		{
			System.out.println("Out of stock");
			System.out.println("Do you want to order that item:(Press 1)");
			int a=sc.nextInt();
			
		}
	}
}
