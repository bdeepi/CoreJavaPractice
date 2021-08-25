package patternMethods;

import java.util.Scanner;
/*
1
22
333
4444
 */

public class Four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);
	}

	public static void pattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);

			}
			System.out.println();

		}

	}

}
