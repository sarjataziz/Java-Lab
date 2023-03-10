import java.lang.*;

public class Start 
{
	public static void main(String[] args)
	{

		Account a1 = new Account(); 
		a1.setAccountNumber("11-111-324");
		a1.setAccountHolderName("Deku");
		a1.setBalance(50_000.00);

		Account a2 = new Account("2222-423-312", "Monkey D. Luffy", 600_000.00);

		Customer c1 = new Customer();
		c1.setNid(11111111);
		c1.setAge(25);
		c1.setMobileNumber("+880711111111231");
		c1.setAccount(a1);


		System.out.println("------------------------------------------------------------");
		System.out.println();
		System.out.println("Customer National ID : " +c1.getNid());
		System.out.println("Customer Age : " +c1.getAge());
		System.out.println("Customer Mobile Number: " +c1.getMobileNumber());
		System.out.println("Customer Account Number : " +c1.getAccount().getAccountNumber());
		System.out.println("Customer Account Holder Name : " +c1.getAccount().getAccountHolderName());
		System.out.println("Customer Balance  : " +c1.getAccount().getBalance());
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println();

		Customer c2 = new Customer(1111111, 24, "+880144554574", a2);


	}
}