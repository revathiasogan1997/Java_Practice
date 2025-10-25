package Collection;

import java.util.*;
public class List_Demo 
{
	public static void main(String[] args) 
	{
					//My own practice//
		
		//ArrayList[Hetrogenious method]
		//Add an elements
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add("Java");
		System.out.println(al);
		System.out.println("Check an element in arraylist: "+al.contains("Java"));//check it,return boolean value
		System.out.println(al);
		System.out.println();
		
		al.addFirst("Phython");//add 1st index
		System.out.println("Add 1st Index: "+al);
		System.out.println();
		
		al.addLast("ReatJs");//add last index
		System.out.println("Add last Index: "+al);
		System.out.println();
		
		//Add an element in perticular index.but, anothers are shifted next index
		al.add(3, 3000);
		System.out.println(al);
		System.out.println();
		
		//Remove a perticular index value
		al.remove(4);
		System.out.println(al);
		System.out.println();
		
		//Get an element
		System.out.println("Get: "+al.get(0));
		System.out.println();
		//Set an element
		al.set(0, "phthon");
		System.out.println("Set: "+al);
		System.out.println();
		
		ArrayList al2=new ArrayList();
		al2.add("Collection");
		al2.add("Interface");
		al.addAll(al2);//add one object values to another object
		System.out.println("Add a 2 object values: "+al);
		System.out.println();
		
		//ArrayList[Homogenious method]
		ArrayList<Integer> al3=new ArrayList<Integer>();
			//We only add a integer value(Specifyed)
		al3.add(null);
		al3.add(1000);
		al3.add(70);
		//System.out.println(al3);
		al3.addAll(0, al);
		System.out.println(al3);
		System.out.println();
		
		//Collection - Applicable for set of classes in collection ArrayList,LinkedList,HashSet
		Collection c=new ArrayList();
		c.add(1);
		c.add(2);
		System.out.println(c);
	
		
		
		
		
		
	}

}
