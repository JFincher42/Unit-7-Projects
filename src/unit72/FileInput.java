package unit72;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileInput {

	public static void main(String[] args) throws FileNotFoundException {
//		File f = new File("important file.txt");
		
//		System.out.println("does file exist? " + f.exists());	// check to see if File f exists
//		System.out.println("getAbsolutePath: " + f.getAbsolutePath()); 	//get the path for File f

		FileReader fr = new FileReader("important file.txt");
		Scanner input = new Scanner(fr);

		while (input.hasNext()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
	}

}
