package basicPrograms;

import java.util.Scanner;
/**
 * This program performs the reverse operation of the given number
 * @author Deepika
 *
 */

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int reverseis = reverse(n);
		System.out.println("Reverse of given number is :" + reverseis);

	}
	/**
	 * This method performs the reverse operation of the given number
	 * @param n ->An integer number
	 * @return reverse of the given number
	 */

	public static int reverse(int n) {
		int rem = 0, rev = 0;
		while (n > 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		return rev;
	}

}
