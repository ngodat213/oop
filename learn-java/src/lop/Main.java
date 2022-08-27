package lop;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		if(!file.exists())
			file.createNewFile();
		FileInputStream fInput = new FileInputStream(file);
		fInput.close();
		FileOutputStream fOutput = new FileOutputStream(file);
		
		String s = "hello my name is hydra";
		fOutput.write(s.getBytes());
		fOutput.close();
	}
	
}
