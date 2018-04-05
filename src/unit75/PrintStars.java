package unit75;

public class PrintStars {

	public static void printStars(int n) {
		for (int i=0; i<n; i++)
			System.out.print("*");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStarsRecursive(5);
	}

	
	
	
	
	
	
	
	
	public static void printStarsRecursive(int n) {
		if (n<=0) {
			System.out.println();
		}
		else {
			System.out.print("*");
			printStarsRecursive(n-1);
		}
	}
	

}
