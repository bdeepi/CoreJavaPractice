package Programs;

import java.util.Scanner;
/**
 * This program finds the least number
 */

public class Least {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if (a < b && a < c && a < d) {
			System.out.println("a is smaller");
		} else if (b < c && b < d) {
			System.out.println("b is smaller");
		} else if (c < d) {
			System.out.println("c is smaller");
		} else {
			System.out.println("d is smaller");
		}
	}

}
