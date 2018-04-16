package unit75;

public class Mystery2 {
	
	public static void mystery2(int n) {
		if (n>100) {
			System.out.print(n);
		} else {
			mystery2(2*n);
			System.out.print(", " + n);
		}
	}

	public static void main(String[] args) {
//		mystery2(113);  System.out.println();
//		mystery2(70);   System.out.println();
		mystery2(42);   System.out.println();
//		mystery2(30);   System.out.println();
//		mystery2(10);   System.out.println();

	}

}
