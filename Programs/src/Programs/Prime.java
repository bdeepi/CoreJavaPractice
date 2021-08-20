package Programs;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, flag = 1;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = 0;
				break;
			}
		}
			if (flag == 1) {
				System.out.println("It is a prime number");
			} else {
				System.out.println("It is not a prime number");
			}
	}

}
