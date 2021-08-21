package Programs;

import java.util.Scanner;
/**
 * Spy Number -> A spy number is a number where the sum of its digits equals the product of its digits.
 * This program finds out whether the given number is spy or not 
 * @author Deepika
 *
 */

public class Spy {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean isSpy = findSpyOrNot(n);
		
		if(isSpy){
			System.out.println(n + " is a Spy number");
		}else{
			System.out.println(n + " is a not Spy number");
		}

	}

	public static boolean findSpyOrNot(int n) {

		int rem;
		int sum = 0;
		int prod = 1;

		while (n > 0) {
			rem = n % 10;
			sum = sum + rem;
			prod = prod * rem;
			n = n / 10;
		}
		if (sum == prod) {
			return true;
		} else {
			return false;
		}

	}
}
