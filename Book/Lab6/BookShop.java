import java.lang.*;

public class BookShop 
{
	private String name;
	private Book listOfBooks[];

	BookShop()
	{
		System.out.println();
	}
	BookShop(String name, int sizeOfArray)
	{
		this.name = name;
		this.listOfBooks = new Book[sizeOfArray];
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public boolean insertBook(Book b)
	{
		boolean flag = false;
		for (int i = 0; i < listOfBooks.length; i++) {
			if (listOfBooks[i] == null) {
				listOfBooks[i] = b;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeBook(Book b)
	{
		boolean flag = false;
		for (int i = 0; i < listOfBooks.length; i++) {
			if (listOfBooks[i] == b) {
				listOfBooks[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public void showAllBooks()
	{
		for (int i = 0; i < listOfBooks.length; i++) {
			if (listOfBooks[i] != null) {
				//System.out.println("*********************************************************");
				System.out.println();
				System.out.println("Book's ISBN                : " +listOfBooks[i].getIsbn());
				System.out.println("Book's Title               : " +listOfBooks[i].getBookTitle());
				System.out.println("Book's Author Name         : " +listOfBooks[i].getAuthorName());
				System.out.println("Book's Price               : " +listOfBooks[i].getPrice());
				System.out.println("Book's Available Quantity  : " +listOfBooks[i].getAvailableQuantity());
				System.out.println("-----------------------------------------------------------");

			}
		}
	}

}