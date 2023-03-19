import java.lang.*;

public class Pizza extends FoodItem
{
	String size;

	Pizza(){
		super();
	}
	Pizza(String size, double price, String name)
	{
		super(price, name);
		this.size = size;
	}

	public void setSize(String size)
	{
		this.size = size;
	}
	public String getSize()
	{
		return size;
	}

	public void showDetailes()
	{
		super.showDetailes();
		System.out.println("Size               : " +size);
	}
}