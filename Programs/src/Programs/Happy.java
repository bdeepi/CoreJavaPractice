package Programs;

import java.util.Scanner;

public class Happy {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem;
		while (n > 9) {
			int s = 0;
			while (n > 0) {
				rem = n % 10;
				s = s + (rem * rem);
				n = n / 10;
			}
			n = s;
		}

		System.out.println(n);

	}

}
