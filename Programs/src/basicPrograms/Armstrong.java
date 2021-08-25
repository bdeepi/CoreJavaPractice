package basicPrograms;

import java.util.Scanner;

/**
 * Armstrong number -> Armstrong number is a number that is equal to the sum of
 * cubes of its digits. 
 * This program finds out whether the given number is Armstrong or not
 * @author Deepika
 * 
 */

public class Armstrong {

	public static void main(String[] args) {
		Armstrong obj = new Armstrong();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isarmstrong = obj.armstrong(n);
		if (isarmstrong) {
			System.out.println("The given number is a Armstrong");
		} else {
			System.out.println("The given number is not a Armstrong");
		}

	}

	/**
	 * This method finds out whether the given number is Armstrong or not
	 * 
	 * @param n -> An integer number
	 * @return true / false -> if Armstrong (true) else (false)
	 */

	public  boolean armstrong(int n) {
		int rem = 0, r = 0, temp = n;
		while (n > 0) {
			rem = n % 10;
			r = r + (rem * rem * rem);
			n = n / 10;

		}
		if (temp == r) {
			return true;
		} else {
			return false;
		}
	}

}
