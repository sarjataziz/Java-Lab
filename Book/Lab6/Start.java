import java.lang.*;

public class Start 
{
	public static void main(String[] args) {
		
		Book book1 = new Book("22-12554-111", "Java", "Sarjat Aziz", 300, 100_000);
		Book book2 = new Book("12-12554-111", "Tree", "Sarjat Aziz", 100, 10_000);
		Book book3 = new Book("32-12554-111", "Story", "Sarjat Aziz", 250, 60_000);
		Book book4 = new Book("42-12554-111", "Java", "Sarjat Aziz", 300, 30_000);
		Book book5 = new Book("62-12554-111", "Java", "Sarjat Aziz", 300, 1_000);

		BookShop bookShop = new BookShop("AB Store", 100);

		if (bookShop.insertBook(book1)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}
		if (bookShop.insertBook(book2)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}
		if (bookShop.insertBook(book3)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}
		if (bookShop.insertBook(book4)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}
		if (bookShop.insertBook(book5)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}

		System.out.println("**********************************************");
		System.out.println("Book Shop's Name           : " +bookShop.getName());
		System.out.println();
		bookShop.showAllBooks();

		if (bookShop.removeBook(book4)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}

		System.out.println("**********************************************");
		System.out.println("Book Shop's Name           : " +bookShop.getName());
		System.out.println();
		bookShop.showAllBooks();
		
	}

}