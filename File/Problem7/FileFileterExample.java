import java.lang.*;
import java.io.File;
import java.io.FileFilter;

public class FileFileterExample
{
	public static void main(String[] args) {
		
		File home = new File("E:/Java/Other");

		FileFilter txtFlter = new FileFilter(){

			@Override
			public boolean accept(File pathname){
				String fileName = pathname.getName();

				if (fileName.endsWith(".txt")) {
					return true;
				}
				return false;
			}
		};

		File[] listRoots = home.listFiles(txtFlter);

		for (File file : listRoots) {
			System.out.println(file.getPath());
		}
	}
}