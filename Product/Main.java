public class Main 
{
	public static void main(String[] args) {
		
		Product a = new Product();

		a.setProductID("QE");
		a.setProductName("Java Book");
		a.setPrice(2133.50);
		a.setAvailableQuantity(100);

		System.out.println("Product ID : " +a.getProductID());
		System.out.println("Product Name : " +a.getProductName());
		System.out.println("Price : " +a.getPrice());
		System.out.println("Available Quntity : " +a.getAvailableQuantity());


		System.out.println("-----------------------------------------");


		Product a1 = new Product("QER", "Java Books", 1324.142, 123);
		a1.showDetails();
	}
}