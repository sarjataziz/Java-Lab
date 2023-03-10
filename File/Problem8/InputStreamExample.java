import java.lang.*;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample
{
	public static void main(String[] args) {
		FileInputStream in = null;
		try{
			in = new FileInputStream("input.txt");
			int c;
			while((c = in.read()) != -1){
				System.out.print((char)c);
				System.out.print(c + ", ");
			}
		}catch(IOException e){
				System.err.println(e);
			}finally{
				try{
					in.close();
				}catch(IOException e2){
					System.out.println(e2);
				}
			}
	
	}
}