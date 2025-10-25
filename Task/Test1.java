package Task;

import java.util.*;
class Outer
{
	class Inner
	{
		void show()
		{
			System.out.println("inside Inner");
		}
	}
}
public class Test1 
{	
	public static void main(String[] args) 
	{
		Outer.Inner obj=new Outer().new Inner();
		obj.show();
		
	}

}
