package basicProgramsMethods;

import java.util.Scanner;
/**
 * Neon Number -> A neon number is a number where the sum of digits of square of the number is equal to the number.
 * This program finds out whether the given number is neon or not
 */

public class Neon {

	public static void main(String[] args) {
		Neon ne = new Neon();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isneon = ne.neon(n);
		if(isneon) {
			System.out.println("The given number is neon");
		}else {
			System.out.println("The given number is not neon");
		}

	}
	/**
	 * This method performs the operation to find whether the given number is neon or not
	 * @param n -> An integer number
	 * @return true / false -> (true) if neon else (false)
	 */
	public  boolean neon(int n) {
		int temp = n;
		n = n * n;
		int rem = 0, r = 0;
		while(n > 0) {
			rem = n % 10;
			r = r + rem;
			n = n /10;
		}
		if(temp == r) {
			return true;
		} else {
			return false;
		}
	}

}
