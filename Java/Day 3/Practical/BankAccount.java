package Demo;

public class BankAccount{ 
	
	String accountNumber;
	String accountHolder;
	double balance;
	
	BankAccount(String accNo, String holder, double bal)
	{
		accountNumber=accNo;
		accountHolder=holder;
		balance=bal;
	}
	
	void deposit(double amount)
	{
		balance= balance + amount;
		System.out.println("Deposited:"+amount);
				
	}
	
	void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance= balance - amount;
			System.out.println("Withdrawn:"+amount)
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	void display()
	{
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Account Holder:"+accountHolder);
		System.out.println("Balance:"+balance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount acc=new BankAccount("123456","vikas",1000);
		acc.display();
		acc.deposit(300);
		acc.withdraw(300);
		acc.display();
	}

}
