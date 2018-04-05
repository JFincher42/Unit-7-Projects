package unit71;

import java.util.ArrayList;

public class ArrayListLab {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(5);
		System.out.println("Size = " + numbers.size());
		for (int i=0; i<10; i++) {
			numbers.add(i);
			System.out.println("Size = " + numbers.size());
		}
		
		for (int i=0; i<10; i++) {
			int square = numbers.get(i)*numbers.get(i);
			numbers.set(i, square);
		}
		
		System.out.println(numbers);

	}

}
