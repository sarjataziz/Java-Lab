import java.lang.*;

public class TextBook extends Book
{
	private int standerd;

	TextBook()
	{
		//System.out.println();
	}
	TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standerd)
	{
		super(isbn, bookTitle, authorName, price, availableQuantity);
		this.standerd = standerd;
		System.out.println();
		System.out.println("Text Book Detailes : ");
		System.out.println("------------------------------------------------------");
	}
	public void setStanderd(int standerd)
	{
		this.standerd = standerd;
	}
	public int getStanderd()
	{
		return standerd;
	}

	public void showDetails()
	{
		super.showDetails();
		System.out.println("Book's Standerd            : " +standerd + ".");
		System.out.println();
		System.out.println("*************************************************************");
		System.out.println();
	}
}