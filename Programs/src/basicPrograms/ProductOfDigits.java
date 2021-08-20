package basicPrograms;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int productof = product(n);
		int sqprod = sqprod(n);
		int sumof = sum(n);
		int sqsumof = sqsum(n);
		System.out.println("prod of digits " + productof);
		System.out.println("prod of sq of  digits " + sqprod);
		System.out.println("sum digits " + sumof);
		System.out.println("sum of sq of  digits " + sqsumof);

	}

	public static int product(int n) {
		int rem, prod = 1;
		while (n > 0) {
			rem = n % 10;
			prod = prod * rem;
			n = n / 10;

		}
		return prod;

	}
	public static int sqprod(int n) {
		int rem, prod = 1;
		while (n > 0) {
			rem = n % 10;
			prod = prod * (rem * rem);
			n = n / 10;

		}
		return prod;

	}

	public static int sum(int n) {
		int rem, sum = 0;
		while (n > 0) {
			rem = n % 10;
			sum = sum +rem;
			n = n / 10;

		}
		return sum;
	}
	public static int sqsum(int n) {
		int rem, sum = 0;
		while (n > 0) {
			rem = n % 10;
			sum = sum + (rem * rem);
			n = n / 10;
		}
		return sum;
	}
}
