import java.lang.*;

public class BookShop 
{
	private String name;
	private Book[] listOfBooks;

	BookShop()
	{
		//System.out.println();
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
		System.out.println("Book Shop's Name : " +name);
			for (Book b : listOfBooks) {
				if (b != null) {
					b.showDetails();
				}
			}
	}

	public void searchBook(String isbn)
    {
        //try{
            for (Book listOfBook : listOfBooks) {
                if (listOfBook != null) {
                    if (listOfBook.getIsbn().equals(isbn)) {
                        listOfBook.showDetails();
                    }
                }
            }
        //}catch(Exception e)
        /*{
            System.out.println();
            //System.out.println("Exception : " +e);
            //System.out.println("......... Put right ISBN .........");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println();
        }*/
        new Book();
    }

}