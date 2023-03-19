import java.lang.*;
import java.util.HashMap;

public class HashMapDemo
{
	public static void main(String[] args) {
		
		//put,get
		HashMap<Integer, String> customer = new HashMap<Integer, String>();

		customer.put(101, "Sarjat");
		customer.put(102, "Aziz");
		customer.put(103, "Rumi");
		customer.put(104, "Dos");
		customer.put(105, "Jos");

		System.out.println(customer.get(102));
		System.out.println(customer.get(101));

	}
}