package Programs;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 0) {
			if (n % 2 == 0) {
				System.out.println("n is even");
			} else {
				System.out.println("n is odd");
			}
			System.out.println("n is positive");
		} else if (n < 0) {
			System.out.println("n is negative");
		} else {
			System.out.println("Neither positive nor negative");

		}

	}

}
