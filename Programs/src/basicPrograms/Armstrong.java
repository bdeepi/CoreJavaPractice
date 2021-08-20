package basicPrograms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isarmstrong = armstrong(n);
		if (isarmstrong) {
			System.out.println("The given number is a Armstrong");
		} else {
			System.out.println("The given number is not a Armstrong");
		}

	}

	public static boolean armstrong(int n) {
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
