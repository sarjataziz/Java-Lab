import java.lang.*;
import java.io.File;
import java.io.IOException;

public class FileDemo 
{
	public static void main(String[] args) {
		
		File dir = new File("Here/My/MyFile");
		dir.mkdirs();
		String path = dir.getAbsolutePath();
		try{
			File file = new File(path + File.separator + "Hello.txt");
			file.createNewFile();
		}catch(IOException e){
			System.out.println(e);
		}
	}
}