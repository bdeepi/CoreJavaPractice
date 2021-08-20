package basicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ispalindrome = palindrome(n);
		if (ispalindrome) {
			System.out.println("The given number is a palindrome");
		} else {
			System.out.println("The given number is not a palindrome");
		}

	}

	public static boolean palindrome(int n) {
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
