import java.lang.*;
import java.util.HasSet;
 
public class HashSetDemo
{
	public static void main(String[] args) {
		
		//put,get
		HasSet<String> fruitsName = new HasSet<String>();

		fruitsName.put("A");
		fruitsName.put("B");
		fruitsName.put("C");
	
		System.out.println(fruitsName);
		System.out.println("Size : " +fruitsName.size());

	}
}