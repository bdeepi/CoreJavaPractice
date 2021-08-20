package basicPrograms;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isleapyr = LeapYr(n);
		if (isleapyr) {
			System.out.println("The given year is a Leap year");
		} else {
			System.out.println("The given year is not a leap year");
		}

	}

	public static boolean LeapYr(int n) {
		if (n % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
