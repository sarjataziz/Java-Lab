import java.lang.*;

public class Start 
{
	public static void main(String[] args) {
		
		Account a[] = new Account[5];

		//--------Non Parameterized Constructor--------

		a[0] = new Account(1205, "Monkey D. Luffy", 10_000);
		System.out.println("-------------------------");
		System.out.println();
		System.out.println("Account Details No. 1 : ");
		a[0].showDetails();
		System.out.println();

		//--------Parameterized Constructor---------

		a[0].setAccountNumber(1205);
		a[0].setAccountHolderName("Monkey D. Luffy");
		a[0].setBalance(10_000);
		System.out.println("Account Number : " +a[0].getAccountNumber());
		System.out.println("Account Holder Name : " +a[0].getAccountHolderName());
		System.out.println("Account balance : " +a[0].getBalance() + " $");
		System.out.println();

		//--------Non Parameterized Constructor--------

		a[1] = new Account(1206, "Monkey D. Garp", 80_000);
		System.out.println("-------------------------");
		System.out.println();
		System.out.println("Account Details No. 2 : ");
		a[1].showDetails();

		a[1].deposit(500);                                                                            //----Deposit 500Tk(Non Parameterized)
		System.out.println("Cuurent Account balance (After deposit) : " +a[1].getBalance() + " $");
		System.out.println();

		//-------- Parameterized Constructor---------

		a[1].setAccountNumber(1206);
		a[1].setAccountHolderName("Monkey D. Garp");
		a[1].setBalance(80_000);
		System.out.println("Account Number : " +a[1].getAccountNumber());
		System.out.println("Account Holder Name : " +a[1].getAccountHolderName());
		System.out.println("Account balance : " +a[1].getBalance() + " $");

		a[1].deposit(500);                                                                            //----Deposit 500Tk(Parameterized)
		System.out.println("Cuurent Account balance (After deposit) : " +a[1].getBalance() + " $");
		System.out.println();
		
		//--------Non Parameterized Constructor--------

		a[2] = new Account();
		System.out.println("-------------------------");
		System.out.println();
		System.out.println("Account Details No. 3 : ");    //Null
		a[2].showDetails();								   //Null
		System.out.println();

		//--------Non Parameterized Constructor------

		a[3] = new Account(1208, "Monkey D. Dragon", 1_000_000);
		System.out.println("-------------------------");
		System.out.println();
		System.out.println("Account Details No. 4 : ");
		a[3].showDetails();
		System.out.println();

		//-------- Parameterized Constructor--------

		a[3].setAccountNumber(1208);
		a[3].setAccountHolderName("Monkey D. Dragon");
		a[3].setBalance(1_000_000);
		System.out.println("Account Number : " +a[3].getAccountNumber());
		System.out.println("Account Holder Name : " +a[3].getAccountHolderName());
		System.out.println("Account balance : " +a[3].getBalance() + " $");
		System.out.println();

		//--------Non Parameterized Constructor-------

		a[4] = new Account(1209, "Gold D.Roger", 1_000_000);
		System.out.println("-------------------------");
		System.out.println();
		System.out.println("Account Details No. 5 : ");
		a[4].showDetails();

		a[4].withdrow(1_000);                                                                            //----Withdrow 1000Tk(Non Parameterized)
		System.out.println("Cuurent Account balance (After withdrow) : " +a[4].getBalance() + " $");
		System.out.println();

		//-------- Parameterized Constructor-------

		a[4].setAccountNumber(1209);
		a[4].setAccountHolderName("Gold D.Roger");
		a[4].setBalance(1_000_000);
		System.out.println("Account Number : " +a[4].getAccountNumber());
		System.out.println("Account Holder Name : " +a[4].getAccountHolderName());
		System.out.println("Account balance : " +a[4].getBalance() + " $");

		a[4].withdrow(1_000);                                                                            //----Withdrow 1000Tk(Parameterized)
		System.out.println("Cuurent Account balance (After withdrow) : " +a[4].getBalance() + " $");
		System.out.println();
		System.out.println();


	}
}