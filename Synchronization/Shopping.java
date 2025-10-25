package Synchronization;

import java.util.*;
public class Shopping 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Order order=new Order();
		UserOrder uorder=new UserOrder();
		System.out.println("Product Pershasing:");
		int n=sc.nextInt();
		if(n==1) 
		{
		order.ProductOrder();
		}
		else 
		{
		System.out.println("Order the product");
		int n1=sc.nextInt();
		uorder.ProductUserOrder();
		}
	}
}
