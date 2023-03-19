import java.lang.*;

public class FoodItem
{
	private double price;
	private String name;
	public static String rasturantName = "ABC";

	FoodItem(){}

	FoodItem(double price, String name)
	{
		this.price = price;
		this.name = name;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public double getPrice()
	{
		return price;
	}
	public String getName()
	{
		return name;
	}

	public void showDetailes()
	{
		System.out.println("Price of Food Item  : " +price +" $ ");
		System.out.println("Name of Food Item   : " +name);
	}

}