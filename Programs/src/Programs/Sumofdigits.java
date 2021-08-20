package Programs;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem, temp = 0;
		while (n > 0) {
			rem = n % 10;
			temp = temp + rem;
			n = n / 10;
		}
		System.out.println("Sum of digits of n is " + temp);

	}

}
