public class Product
{
	private String productID;
	private String productName;
	private double price;
	private int availableQuantity;

	public Product()
	{
		System.out.println("Product Details : ");
	}
	public Product(String productID, String productName, double price, int availableQuantity)
	{
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.availableQuantity = availableQuantity;

		System.out.println("Product Details : ");
	}
	public void setProductID(String productID)
	{
		this.productID = productID;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	public String getProductID()
	{
		return productID;
	}
	public String getProductName()
	{
		return productName;
	}
	public double getPrice()
	{
		return price;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	public void showDetails()
	{
		System.out.println("Product ID : " +productID);
		System.out.println("Product Name : " +productName);
		System.out.println("Price : " +price);
		System.out.println("Available Quntity : " +availableQuantity);
	}
}