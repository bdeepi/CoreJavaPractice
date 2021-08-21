package Programs;

import java.util.Scanner;
/**
 * This program performs product of sq  the digits of the given number
 * @author Deepika
 *
 */

public class ProductOfSqOfD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem, temp = 1;
		while (n > 0) {
			rem = n % 10;
			temp = temp * (rem * rem);
			n = n / 10;
		}
		System.out.println("Product of sqs of digits is " + temp);

	}

}
