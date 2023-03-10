import java.lang.*;

public class Account 
{
	protected String accountNumber;
	protected String accountHolderName;
	protected double balance;
	public static double perTransactionLimit;

	public Account()
	{
		System.out.println();
		System.out.println("Parents class Empty cons.");
		System.out.println();
	}
	public Account(String accountNumber, String accountHolderName, double balance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		System.out.println();
		System.out.println("Parents class Empty cons.");
		System.out.println();
	}

	public static void setPerTransactionLimit(double ptr)
	{
		perTransactionLimit = ptr;
	}
	public static double getPerTransactionLimit()
	{
		return perTransactionLimit;
	}

	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public String getAccountNumber()
	{
		return accountNumber;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public double getBalance()
	{
		return balance;
	}
	public void depositMoney(double ammount)
	{
		if (ammount > 0 && ammount <= perTransactionLimit) {
			System.out.println("Previous Balance : " +balance);
			System.out.println("Deposite Ammount : " +ammount);

			balance =+ ammount;

			System.out.println("Current Balance  : " +balance);
		}
		else{
			System.out.println("...................Invalid Request........................");
		}
	}
	public void withdrawMoney(double ammount)
	{
		if (ammount > 0 && ammount <= perTransactionLimit && ammount <= balance) {
			System.out.println("Previous Balance : " +balance);
			System.out.println("Deposite Ammount : " +ammount);

			balance =- ammount;

			System.out.println("Current Balance  : " +balance);
		}
		else{
			System.out.println("...................Invalid Request........................");
		}
	}
	public void showDetails()
	{
		System.out.println("Account Holder Name   : " +accountHolderName);
		System.out.println("Account Numver        : " +accountNumber);
		System.out.println("Balance               : " +balance);
		System.out.println("Per Transaction Limit : " +perTransactionLimit);
	}

}	

