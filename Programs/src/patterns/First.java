package patterns;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				System.out.print(" * ");
				// System.out.print( " " + i + j + " ");

			}
			System.out.println();
		}

	}

}