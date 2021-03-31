import java.util.Scanner;
public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount obj1 = new BankAccount("XYZ","1000");
		obj1.showMenu();

	}

}

class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cid)
	{
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount)
	{
		if(amount != 0)
		{
			balance = balance + amount;
			previousTransaction = amount;
			System.out.println(amount + " is deposited successfully");
		}
	}
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			balance = balance - amount;
			previousTransaction = -amount;
			System.out.println(amount + " is withdrawn successfully");
		}
	}
	void getPreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposited : "+ previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("Withdrawn : "+ Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No Transaction Occured");
		}
		
	}
	void showMenu()
	{
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your Id is  " + customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance " );
		System.out.println("B. Deposit ");
		System.out.println("C. Withdraw ");
		System.out.println("D. Previous Transaction ");
		System.out.println("Exit ");
		
		do
		{
			System.out.println("-----------------------------------------------------------");
			System.out.println("Enter an option: ");
			System.out.println("----------------------------------------------------------- ");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("-------------------------------------------------------");
				System.out.println("Balance = " + balance);
				System.out.println("-------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("-------------------------------------------------------");
				System.out.println("Enter amount to be deposited: ");
				System.out.println("-------------------------------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("-------------------------------------------------------");
				System.out.println("Enter amount to be withdrawn: ");
				System.out.println("-------------------------------------------------------");
				int amount1 = scanner.nextInt();
				withdraw(amount1);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("-------------------------------------------------------");
				getPreviousTransaction();
				System.out.println("-------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("********************************************************");
				System.out.println("\n");
				break;
				
				
			default:
				System.out.println("Invalid Option!. Please select a correct option");
				break;
				
			}
		}
		while(option != 'E');
		
		System.out.println("Thank You for using our Services");
		
		
	}
}
