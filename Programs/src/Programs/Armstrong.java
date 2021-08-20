package Programs;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int rem;
		int r = 0;
		while (n > 0) {
			rem = n % 10;
			r = r + (rem * rem * rem);
			n = n / 10;

		}
		if (r == temp) {
			System.out.println("It is an Armstrong number");
		} else {
			System.out.println("Not an Armstrong number");
		}

	}

}
