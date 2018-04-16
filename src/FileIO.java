import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintStream;

public class FileIO {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader input = new FileReader("input.txt");
		File output = new File("output.txt");
		
		Scanner in = new Scanner(input);
		PrintStream out = new PrintStream(output);
		
		in.close();
		out.close();
	}

}
