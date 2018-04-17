package unit72;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;

import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) throws FileNotFoundException	{
		FileReader fr = new FileReader("input.txt");
		Scanner input = new Scanner(fr);
		
		File f = new File("output.txt");
		PrintStream output = new PrintStream(f);
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			String[] tokens = line.split(" ");
			output.println(line);
		}
		
		input.close();
		output.close();
	}

}
