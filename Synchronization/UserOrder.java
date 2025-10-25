package Synchronization;

import java.util.*;
import java.lang.*;
public class UserOrder
{
	OutOfStock os=new OutOfStock();
//	Scanner sc=new Scanner(System.in);
	 public void ProductUserOrder()
	{
		Scanner sc=new Scanner(System.in);
		//String name="bags",name1="books",name2="pen";
		//int name,name1,name2;
		int bage=20;
		int books=30; 
		int pen=40;
		System.out.println("Which product you want:\n1.Bags "+bage+"\n2.Books "+books+"\n3.Pen "+pen);
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("How many bages you want:");
			int name=sc.nextInt();
			if(name>=bage)
			{
			System.out.println("Order Successfully");
			bage-=name;
			System.out.println("Total Remaining: "+bage);
			}
			else
			{
				System.out.println("Out of stock");
				//OutOfStock();
			}
		}
		if(n==2)
		{
			System.out.println("How many books you want:");
			int name1=sc.nextInt();
			if(name1>=books)
			{
			System.out.println("Order Successfully");
			books-=name1;
			System.out.println("Total Remaining: "+books);
			}
			else
			{
				System.out.println("Out of stock");
				//OutOfStock();
			}	
		}
		if(n==3)
		{
			System.out.println("How many pens you want:");
			int name2=sc.nextInt();
			if(name2>=pen)
			{
			System.out.println("Order Successfully");
			pen-=name2;
			System.out.println("Total Remaining: "+pen);
			}
			else
			{
				System.out.println("Out of stock");
				//OutOfStock();
			}	
		}
	}

	}
