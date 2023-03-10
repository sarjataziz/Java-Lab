import java.lang.*;
import java.io.File;

public class ListingFiles
{
	public static void main(String[] args) {
		
		File home = new File("E:/Java/Other");

		File[] listRoots = home.listFiles();

		for (File file : listRoots) {
			System.out.println(file.getPath());
		}
	}
}