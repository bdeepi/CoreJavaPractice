package patternMethods;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);
		System.out.println(n);
	}
	public static void pattern(int n) {
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" " + i + " ");
			}
			System.out.println();
		}
	

	}

}
