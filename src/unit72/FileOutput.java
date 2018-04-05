package unit72;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileOutput {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output = new PrintStream(new File("hello.txt"));
		output.println("Hello, world.");
		output.println();
		output.println("This program produces four");
		output.println("lines of output.");
	}

}
