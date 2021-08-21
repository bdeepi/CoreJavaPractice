package Programs;

import java.util.Scanner;
/**
 * This programs finds out whether the given number is even or odd
 * @author Deepika
 *
 */

public class EvenOdd {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
	}

}
