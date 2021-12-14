package basicProgramsMethods;

import java.util.Scanner;
/**
 * This program finds out whether the given number is a palaindrome or not
 * @author admin
 *
 */

public class Palindrome {

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ispalindrome =p. palindrome(n);
		if (ispalindrome) {
			System.out.println("The given number is a palindrome");
		} else {
			System.out.println("The given number is not a palindrome");
		}

	}
	/**
	 * This method finds the palindrome of the number
	 * @param n ->An integer number
	 * @return true / false -> (true)if palindrome else (false)
	 */

	public  boolean palindrome(int n) {
		int rem = 0, rev = 0, temp = n;
		while (n > 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		if (temp == rev) {
			return true;
		} else {
			return false;
		}

	}
}
