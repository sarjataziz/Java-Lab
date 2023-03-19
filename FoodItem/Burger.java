import java.lang.*;

public class Burger extends FoodItem
{
	int numberOfPatties;

	Burger(){
		super();
	}
	Burger(int numberOfPatties, double price, String name)
	{
		super(price, name);
		this.numberOfPatties = numberOfPatties;
	}

	public void setNumberOfPatties(int numberOfPatties)
	{
		this.numberOfPatties = numberOfPatties;
	}
	public int getNumberOfPatties()
	{
		return numberOfPatties;
	}

	public void showDetailes()
	{
		super.showDetailes();
		System.out.println("NumberO f Patties     : " +numberOfPatties);
	}
}