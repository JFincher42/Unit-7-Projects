package unit75;

public class Fibonacci {

	public static void main(String[] args) {
		int x=10;
		System.out.println("Fib " + x + " = " + fib(x));

	}

	public static int fib(int n) {
		// TODO: Add iterative code here
		return 0;		
	}
	
	
	
	
	
	





	
	
	
	
	
	public static int fibr(int n) {
		if (n==1 || n==2) return 1;
		return (fib(n-1) + fib(n-2));
	}
}
