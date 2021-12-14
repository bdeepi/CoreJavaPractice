package basicProgramsMethods;

import java.util.Scanner;
/**
 * Happy -> A happy number is nothing but the sum of the squares of its digits should eventually equal to 1
 * This program finds out whether the given number is happy or not
 * @author Deepika
 *
 */

public class Happy {

	public static void main(String[] args) {
		Happy h = new Happy();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ishappy = h.happy(n);
		System.out.println(ishappy);
	}
	/**
	 * This method finds out whether the given number is happy or not
	 * @param n -> An integer number
	 * @return n -> the result the of the given number which is an integer
	 */
		public  int happy(int n) {
		int rem;
		while (n > 9) {
			int s = 0;
			while (n > 0) {
				rem = n % 10;
				s = s + (rem * rem);
				n = n / 10;
			}
			n = s;
		}
		return n;

	}
	}



