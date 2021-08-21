package Programs;

import java.util.Scanner;
/**
 * This program performs the swapping of two numbers without using a temporary variable
 * @author admin
 *
 */

public class Swapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt(); // a = 2, b = 3
		a = a + b; // a = 5
		b = a - b; // b = 2
		a = a - b;// a = 3
		System.out.println("Swapping of a & b is " + a + " " + b);

	}

}
