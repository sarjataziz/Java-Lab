import java.lang.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample
{
	public static void main(String[] args) {
		
		Reader reader = null;
		try{
			reader = new FileReader("input.txt");
			int c;
			while((c = reader.read()) != -1){
				char ch = (char) c;
				System.out.print(ch);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if (reader != null) {
					reader.close();
				}
			}catch(IOException e2){
				e2.printStackTrace();
			}
		}
	}
}