import java.util.*;

			//My own practice//
class Task
{
	static int a,b,c;
	void Totalvalue(int a,int b,int c)
	{
		double val=a*b*c;
		System.out.println("Total value is: "+val);
	}
}
public class Practice 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello World");
		System.out.println("Enter 1st value:");
		int num=sc.nextInt();
		System.out.println("Enter 2nd value:");
		int num1=sc.nextInt();
		System.out.println("Enter 3rd value:");
		int num2=sc.nextInt();
		Task task=new Task();
		task.Totalvalue(num,num1,num2);
	}
	
	
	
}
