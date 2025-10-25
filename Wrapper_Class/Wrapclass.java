package Wrapper_Class;

public class Wrapclass 
{
	public static void main(String[] args) 
	{
		int a=10;
		Integer a1=Integer.valueOf(a);//Boxing
		System.out.println("Primitive convert to object");
		System.out.println(a1.getClass());
		System.out.println(a1);
		System.out.println();
		Integer a2=a;//Unboxing
		System.out.println(a2.getClass());
		System.out.println(a2);
		System.out.println();
		char c='b';
		Character c1=Character.valueOf(c);//Boxing
		System.out.println(c1);
		Character c2=c;//Unboxing
		System.out.println(c2);
		System.out.println();
		
		boolean boo=true;
		Boolean b=Boolean.valueOf(boo);
		System.out.println(b);
		Boolean b1=false;
		boolean b2=b1.booleanValue();//Unboxing
		System.out.println(b2);
		
		
		
	}

}
