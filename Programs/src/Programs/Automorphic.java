package Programs;

import java.util.Scanner;
/**
 * Automorphic -> A number is called an Automorphic number if and only if the
 * square of the given number ends with the same number itself
 * This program find outs whether the given number is Automorphic or not
 * @author Deepika
 * 
 */

public class Automorphic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s, rem, temp;
		s = n * n;
		rem = s % 10;
		temp = rem;
		if (temp == n) {
			System.out.println("Automorphic number");
		} else {
			System.out.println(" Not a Automorphic number");
		}

	}

}
