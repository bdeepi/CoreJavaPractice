package Programs;

import java.util.Scanner;
/**
 * This program finds out whether the given number is a palindrome or not
 * @author admin
 *
 */

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem, r = 0, temp = n;
		while (n > 0) {
			rem = n % 10;
			r = (r * 10) + rem;
			n = n / 10;

		}
		if (r == temp) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}

	}

}
