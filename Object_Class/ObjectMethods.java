package Object_Class;
				//My own practice//
public class ObjectMethods implements Cloneable
{
	int b;
	public String toString()
	{
		return "ObjectMethod";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		System.out.println("------Object Class-----");
		System.out.println("Getclass Method:");
		ObjectMethods ob=new ObjectMethods();
		System.out.println(ob.getClass());
		
		String s="Java";
		System.out.println(s.getClass());
		
		Integer i=10;
		System.out.println(i.getClass());
		System.out.println();
		
		ob.b=20;
		System.out.println(ob.b);
		//copy ob,store another reference
		System.out.println("Clone Method:");
		ObjectMethods obj=(ObjectMethods)ob.clone();
		System.out.println("Old value "+obj.b);
		obj.b=200;
		System.out.println("New value "+obj.b);
		System.out.println();
		System.out.println("HashCode Method:");
		System.out.println(ob.hashCode());
		System.out.println(s.hashCode());
		System.out.println(i.hashCode());
		System.out.println();
		System.out.println("toString Method:");
		System.out.println(ob);
		System.out.println(obj);
		System.out.println();
		
		
		
	}

}
