package basicPrograms;

import java.util.Scanner;
/**
 * This program finds out whether the given is Leap year or not
 * @author admin
 *
 */

public class Leap {

	public static void main(String[] args) {
		Leap l = new Leap();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isleapyr =l.LeapYr(n);
		if (isleapyr) {
			System.out.println("The given year is a Leap year");
		} else {
			System.out.println("The given year is not a leap year");
		}

	}
	/**
	 * This method performs the operation for leap year
	 * @param n -> An integer number
	 * @return true / false -> (true)if leap year else(false)
	 */

	public  boolean LeapYr(int n) {
		if (n % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
