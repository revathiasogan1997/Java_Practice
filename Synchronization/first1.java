package Synchronization;

import java.util.*;
public class first1 
{
	Scanner sc=new Scanner(System.in);
	public void display()
	{
		ComputerScience cs=new ComputerScience();
		Tamil t=new Tamil();
		int option;
	String a="Gobi arts and science college";
	 System.out.println("Welcome to all \n" +a);
	 System.out.println();
	 System.out.print("Our college courses(UG level):\n");
	 System.out.println("1.Computer Science\n2.Tamil\n3.English");
	 System.out.println("Select any one(for many details for this course)");
	 option=sc.nextInt();
//	 if(option==1)
//	 {
//		 cs.Details();
//	 }
	 switch(option)
	 {
	 case 1:System.out.println("Gobi arts and science college");
	 		cs.Details();
	 		break;
	 case 2:System.out.println("Gobi arts and science college");
			t.Details();
			break;
	 default: System.out.println("Select any one course");
			break;
	 }
	 

	 
	}
}
