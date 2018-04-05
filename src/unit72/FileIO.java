package unit72;

import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import java.util.Scanner;
import java.util.Arrays;

public class FileIO {

	public static void main(String[] args) throws FileNotFoundException	{
		FileReader fr = new FileReader("input.txt");
		Scanner input = new Scanner(fr);
		
		File f = new File("output.txt");
		PrintStream output = new PrintStream(f);
		
		while (input.hasNextLine()) {
			String str = input.nextLine();
			String[] words = str.split("i");
			System.out.println(Arrays.toString(words));
			// TODO: Magic happens!
//			output.println(str);
		}
		
		input.close();
		output.close();
	}

}
