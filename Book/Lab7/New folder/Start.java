public class Start{
	public static void main(String [] args){
		
		StoryBook sb1 = new StoryBook("	1-86092-006-3","An Occurrence at Owl Creek Bridge One of the Missing","Ambrose Bierce",35.00,60,"Story Book");
		StoryBook sb2 = new StoryBook("1-86092-022-5","A Boy at Seven","John Bidwell",40.06,55,"Story Book");
		StoryBook sb3 = new StoryBook("1-86092-049-7","The Grass is Always Greener","Jeffrey Archer",85.6,60,"Story Book");
		StoryBook sb4 = new StoryBook("1-86092-010-1","The Higgler","A. E. Coppard",30.2,60,"Story Book");
		StoryBook sb5 = new StoryBook("1-86092-014-4","The Hostage","C. S. Forester",10.5,60,"Story Book");

		TextBook tb1 = new TextBook("9780321330253","Concepts of Programming Languages","Robert W. Sebesta",36.6,60,1);
		TextBook tb2 = new TextBook("9781418836399","C++ Programming: From Problem Analysis to Program Design","D. S. Malik",29.4,35,1);
		TextBook tb3 = new TextBook("9780321293831","International Economics: Theory And Policy","Krugman, Paul R.; Obstfeld, Maurice",31.9,70,1);
		TextBook tb4 = new TextBook("9780321270764","Technical Communication","John M. Lannon",45.2,55,1);
		TextBook tb5 = new TextBook("9780131963160","Organic Chemistry","Paula Yurkanis Bruice",20.7,15,1);

		BookShop bookShop = new BookShop("Book Shop 1");

		if(bookShop.insertBook(sb1)){System.out.println("Done");}
		else{System.out.println("Not Done");}

		if(bookShop.insertBook(sb2)){System.out.println("Done");}
		else{System.out.println("Not Done");}

		if(bookShop.insertBook(sb3)){System.out.println("Done");}
		else{System.out.println("Not Done");}

		if(bookShop.insertBook(sb4)){System.out.println("Done");}
		else{System.out.println("Not Done");}

		if(bookShop.insertBook(sb5)){System.out.println("Done");}
		else{System.out.println("Not Done");}

		if(bookShop.insertBook(tb1)){System.out.println("Done");}
		else{System.out.println("Not Done");}

		if(bookShop.insertBook(tb2)){System.out.println("Done");}
		else{System.out.println("Not Done");}

		if(bookShop.insertBook(tb3)){System.out.println("Done");}
		else{System.out.println("Not Done");}

		if(bookShop.insertBook(tb4)){System.out.println("Done");}
		else{System.out.println("Not Done");}

		if(bookShop.insertBook(tb5)){System.out.println("Done");}
		else{System.out.println("Not Done");}

		bookShop.showAllBooks();

		Book forSearch = new Book();
		forSearch=bookShop.searchBook("1-86092-049-7");
		if(forSearch!=null){System.out.println("-------------Found--------------");forSearch.showDetails();}
		else{System.out.println("Don't match");}
	}
}