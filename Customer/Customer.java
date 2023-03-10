import java.lang.*;

public class Customer 
{
	private int nid;
	private int age;
	private String mobileNumber;        // int number = 71111111;									
	private Account account;           //  System.out.println("+8801"+number);

	public Customer()
	{
		System.out.println("E-Customer.");
	}
	public Customer(int nid, int age, String mobileNumber, Account account)
	{
		System.out.println("P-Customer.");
		this.nid = nid;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.account = account;
		
	}

	public void setNid(int nid)
	{
		this.nid = nid;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}
	public void setAccount(Account account)
	{
		this.account = account;	
	}

	public int getNid()
	{
		return nid;
	}
	public int getAge()
	{
		return age;
	}
	public String getMobileNumber()
	{
		return mobileNumber;
	}
	public Account getAccount()
	{
		return account;
	}

}