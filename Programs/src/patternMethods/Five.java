package patternMethods;

import java.util.Scanner;
/*
 11
 21 22
 31 32 33
 41 42 43 44
 */

public class Five {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);
		System.out.println(n);
	}

	public static void pattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + i + j);
			}
			System.out.println();
		}

	}

}
