import java.lang.*;

public class Start 
{
	public static void main(String[] args) {
		
		FoodItem pizza = new Pizza("Large", 30, "AB");
		pizza.showDetailes();

		FoodItem burger = new Burger(5, 40, "AB");
		burger.showDetailes();
	}
}