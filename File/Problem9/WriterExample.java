import java.lang.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;

public class WriterExample
{
	public static void main(String[] args) {
		
		Writer writer;
		String text = "Tjkhjk JKHL KDSA" + "AFKJF FAS" + "AFSHFSAFASFDDFFSDSFADSF";

		try{
			writer = new FileWriter("output.txt");
			writer.write(text);
			writer.flush();
			writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}