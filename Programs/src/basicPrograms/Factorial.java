package basicPrograms;

import java.util.Scanner;
/**
 * This program finds out the factorial of a given number
 * @author Deepika
 *
 */

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double factof = FactorialOf(n);
		System.out.println ("factorial of " + n + ":" +factof );
	

	}
	/**
	 * This method perform factorial of a given number
	 * @param n -> An integer number
	 * @return the factorial of the given number 
	 */
	public static double FactorialOf(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
