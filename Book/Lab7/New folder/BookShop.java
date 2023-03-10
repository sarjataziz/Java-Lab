public class BookShop{
	private String name;
	private Book [] listOfBooks=new Book [100];

	public BookShop(){}
	public BookShop(String name){this.name=name;}

	public void setName(String name){this.name=name;}
	public String getName(){return name;}

	public boolean insertBook(Book b){
		boolean flag=false;
		for(int i=0;i<listOfBooks.length;i++){
			if(listOfBooks[i]==null){
				listOfBooks[i]=b;
				flag=true;
				break;
			}
		}
		return flag;
	}
	public boolean removeBook(Book b){
		boolean flag=false;
		for(int i=0;i<listOfBooks.length;i++){
			if(listOfBooks[i]==b){
				listOfBooks[i]=null;
				flag=true;
				break;
			}
		}
		return  flag;
	}
	public void showAllBooks(){
		System.out.println("Shop Name: "+name);
		for(int i=0;i<listOfBooks.length;i++){
			if(listOfBooks[i]!=null){
			listOfBooks[i].showDetails();
			System.out.println();	
			}
		}
	}
	public Book searchBook(String isbn){
		Book forReturn= new Book();
		int temp=-1;
		for(int i=0;i<listOfBooks.length;i++){
			if(listOfBooks[i]!=null){
					if(listOfBooks[i].getIsbn()==isbn){
					temp=i;
					break;
				}
			}
			else{continue;}
		}
		if(temp!=-1){return listOfBooks[temp];}
		else{return null;}
	}
}