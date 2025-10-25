package InnerClass;
			//My own practice//
class Bank
{
	private int balance=10000;
	void deposite()
	{
		balance+=2000;
		System.out.println("Deposited "+balance);
	}
	class Gpay
	{ 
		void trans()
		{
			int transferamount=1000;
			balance-=transferamount;
			System.out.println("Transfered "+balance);
		}
	}
	
	//Method local inner class
	void NetBanking()
	{
		class CashBack
		{
			void paymentOption()
			{
				System.out.println("Congratulation");
			}
		}
		CashBack ob2=new CashBack();
		ob2.paymentOption();
	}
}

public class Task {
	
	public static void main(String[] args) 
	{
		Bank ob=new Bank();
		ob.deposite();
		ob.NetBanking();
		Bank.Gpay obj=ob.new Gpay();//nested class object creation
		obj.trans();
	}

}
