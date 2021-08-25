package basicPrograms;

import java.util.Scanner;
/**
 * This program finds whether the given number is prime or not
 * @author Deepika
 *
 */

public class Prime {

	public static void main(String[] args) {
		Prime obj = new Prime();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isprime = obj.prime(n);
		if (isprime) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("not a prime number");
		}
		
		

	}
	/**
	 * This method finds whether the given number is prime or not
	 * @param n -> An integer number
	 * @return true / false -> (true) if prime, else (false)
	 */

	public   boolean prime(int n) {
		int flag = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			return true;
		} else {
			return false;
		}
	}
}
