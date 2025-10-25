package GarbageCollector;

			//My own practice//
public class GarCollect 
{
	public void finalize()
	{
//		public void demo()
//		{
//			GarCollect gc=new GarCollect();
//		}
		System.out.println("Garbage Collector");
	}
	public static void main(String[] args) 
	{
		GarCollect ob=new GarCollect();
		GarCollect obj=new GarCollect();
		//ob=null;
		//ob=obj;
		//new GarCollect();
		System.out.println("Hello World");
		System.gc();
	}

}
