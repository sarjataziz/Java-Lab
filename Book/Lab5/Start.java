import java.lang.*;

public class Start 
{
	public static void main(String[] args) {
		
		Book storyBook = new StoryBook("1231-213-888", "Ghost Hunter", "Sarjat Aziz", 240, 10_000, "Story Book");
		storyBook.showDetails();
		storyBook.addQuantity(500);
		storyBook.sellQuantity(1500);
		System.out.println("Book's Available Quantity : " +storyBook.getAvailableQuantity() + ".[After add and sell]");
		System.out.println("*************************************************************");

		Book textBook = new TextBook("888-213-111", "Java", "Sarjat Aziz", 140, 10_000, 100);
		textBook.showDetails();
		textBook.addQuantity(200);
		textBook.sellQuantity(1200);
		System.out.println("Book's Available Quantity : " +textBook.getAvailableQuantity() + ".[After add and sell]");
		System.out.println("*************************************************************");
	}
}