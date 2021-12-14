package basicProgramsMethods;

import java.util.Scanner;
/**
 * This programs performs the various operations like  prod of digits, prod of sqs of digits, sum of digits, sum of sq of digits  for the given number
 * @author Deepika
 *
 */

public class ProductOfDigits {

	public static void main(String[] args) {
		ProductOfDigits pod = new ProductOfDigits();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int productof = pod. product(n);
		int sqprod = sqprod(n);
		int sumof = sum(n);
		int sqsumof = sqsum(n);
		System.out.println("prod of digits " + productof);
		System.out.println("prod of sq of  digits " + sqprod);
		System.out.println("sum digits " + sumof);
		System.out.println("sum of sq of  digits " + sqsumof);

	}
	/**
	 * This method performs the product of digits of the given number
	 * @param n ->An integer number
	 * @return prod -> prod of the digits of the given number
	 */

	public  int product(int n) {
		int rem, prod = 1;
		while (n > 0) {
			rem = n % 10;
			prod = prod * rem;
			n = n / 10;

		}
		return prod;

	}
	/**
	 * This method performs the product of sq of  digits of the given number
	 * @param n -> An integer number
	 * @return prod -> prod of the sq of digits of the given number
	 */
	public static int sqprod(int n) {
		int rem, prod = 1;
		while (n > 0) {
			rem = n % 10;
			prod = prod * (rem * rem);
			n = n / 10;

		}
		return prod;

	}
	/**
	 * This method performs the sum of digits of the given number
	 * @param n -> An integer number
	 * @return sum -> sum of the digits of the given number
	 */

	public static int sum(int n) {
		int rem, sum = 0;
		while (n > 0) {
			rem = n % 10;
			sum = sum +rem;
			n = n / 10;

		}
		return sum;
	}
	/**
	 * This method performs the sum of sqs of digits of the given number
	 * @param n -> An integer number
	 * @return sum -> sum of the digits of sq of the given number
	 */
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
