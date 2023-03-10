import java.lang.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample
{
	public static void main(String[] args) {
		
		String destFile = "output.txt";
		String data = "Lorem ipsum dolor sit amet," + " consectetur adipiscing elit. " + "Suspendisse at placerat ipsum. ";

		try{
			FileOutputStream fos = new FileOutputStream(destFile);

			fos.write(data.getBytes());
			fos.flush();
			fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}