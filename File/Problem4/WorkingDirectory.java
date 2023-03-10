import java.lang.*;
import java.io.File;
import java.io.IOException;

public class WorkingDirectory {
	public static void main(String[] args){

		String w = System.getProperty("user.dir");
		System.out.println(w);
	}
}