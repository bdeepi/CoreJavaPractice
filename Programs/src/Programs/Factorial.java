package Programs;

import java.util.Scanner;
/**
 * This program finds out the factorial of a given number
 * @author Deepika
 *
 */

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, fact = 1;
		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

}
