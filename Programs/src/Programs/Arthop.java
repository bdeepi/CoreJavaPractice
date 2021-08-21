package Programs;

import java.util.Scanner;
/**
 * This program performs the different arithmetic operations
 * @author deepika
 *
 */

public class Arthop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		c = a + b;
		System.out.println("addition of a & b :" + c);
		c = a - b;
		System.out.println("Difference of a & b :" + c);
		c = a * b;
		System.out.println("product of a & b :" + c);
		c = a / b;
		System.out.println("division of a & b :" + c);
		c = a % b;
		System.out.println("modulo of a & b :" + c);

	}
}
