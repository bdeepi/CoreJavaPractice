package Programs;

import java.util.Scanner;

public class ProductOfDigitsOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem, temp = 1;
		while (n > 0) {
			rem = n % 10;
			temp = temp * rem;
			n = n / 10;
		}
		System.out.println("Product of digits of number is " + temp);

	}

}
