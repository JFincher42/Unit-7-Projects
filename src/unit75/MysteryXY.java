package unit75;

public class MysteryXY {
	
	public static void mysteryXY(int x, int y) {
		if (y==1) {
			System.out.print(x);
		} else {
			System.out.print(x*y + ", ");
			mysteryXY(x, y-1);
			System.out.print(", "  + x*y);
		}
	}

	public static void main(String[] args) {
//		mysteryXY(4, 1);
//		mysteryXY(4, 2);
//		mysteryXY(8, 2);
//		mysteryXY(4, 3);
		mysteryXY(3, 4);
	}

}
