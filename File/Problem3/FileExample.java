import java.lang.*;
import java.io.File;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args){

		File file = new File("Hello.txt");

		if (file.exists()) {
			System.out.println("File exists. ");
		}
		else {
			System.out.println("File doesn't exists.");
		}
		try{
			file.createNewFile();
		}catch(IOException e){
			System.out.println(e);
			e.printStackTrace();
		}
		if (file.isFile()) {
			System.out.println("Is File. ");
		}
		else {
			System.out.println("Is't File. ");
		}
		if (file.isDirectory()) {
			System.out.println("Is Directory. ");
		}
		else {
			System.out.println("Is't Directory. ");
		}
	}
}