package Programs;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int i, rem, sum = 0;
		while (n > 0) {
			rem = n % 10;
			int fact = 1;
			for (i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("It is a strong number");
		} else {
			System.out.println("It is not a strong number");
		}

	}

}
