package basicPrograms;

import java.util.Scanner;
/**
 * Spy Number -> A spy number is a number where the sum of its digits equals the product of its digits.
 * This program finds out whether the given number is spy or not 
 * @author Deepika
 *
 */

public class Spy {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean isspy = spy(n);

		if (isspy) {
			System.out.println("Spy number");
		} else {
			System.out.println("not Spy number");
		}

	}
	/**
	 * This method finds out whether the given number is spy or not 
	 * @param n -> An integer number
	 * @return true / false -> (true) if spy, else (false)
	 */

	public static boolean spy(int n) {

		int rem;
		int sum = 0;
		int prod = 1;

		while (n > 0) {
			rem = n % 10;
			sum = sum + rem;
			prod = prod * rem;
			n = n / 10;
		}
		if (sum == prod) {
			return true;
		} else {
			return false;
		}

	}
}
