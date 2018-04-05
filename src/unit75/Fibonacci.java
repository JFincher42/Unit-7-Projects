package unit75;

public class Fibonacci {

	public static void main(String[] args) {
		int x=10;
		System.out.println("Fib " + x + " = " + fib(x));

	}

	public static int fib(int n) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static int fibr(int n) {
		if (n==1) return 1;
		if (n==2) return 2;
		return (fib(n-1) + fib(n-2));
	}
}
