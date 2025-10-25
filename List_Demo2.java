package Collection;

import java.util.*;
public class List_Demo2 
{
	public static void main(String[] args) 
	{
				//My own practice//
		
		LinkedList<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(20);
		l.add(30);
		l.add(260);
		l.add(190);
		l.add(0);
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.set(2, 12345));//Replace specifyed index value
		System.out.println(l);
		System.out.println("Retrive 1st element: "+l.peek());
		System.out.println("Remove 1st element: "+l.poll());
		System.out.println("Finalice: "+l);
		System.out.println();
		
		System.out.println(l.remove(4));
		System.out.println(l.removeLast());
		System.out.println(l);//Remove 4th index and last
		
		System.out.println(l.isEmpty());//Check "l" is empty or not
		System.out.println(l.offer(546));//Adds the specified element as the tail (last element) of this list
		System.out.println(l.offerLast(42109));//Inserts the specified element at the end of this list.
		System.out.println(l.indexOf(546));//show an index
		//l.clear();//clear all elements
		System.out.println(l.contains(546));//check the specify element in list,return boolean value
		
		LinkedList l2=new LinkedList();
		l2.add(100);
		l2.add("Hi");
		l2.add('a');
		System.out.println(l2);
		System.out.println(l2.get(2));
		l2.set(2, 1987);
		System.out.println(l2);
		
		
		
	}

}
