package Programs;

import java.util.Scanner;
/**
 * This program finds the reverse of a given number
 * @author Deepika
 *
 */

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			
		
		System.out.println("Reverse of  number is " + reverseOfNumber(n));

	}
	
	public static int reverseOfNumber(int number){
		
		int rem, r = 0;
		while (number > 0) {
			rem = number % 10;
			r = (r * 10) + rem;
			number = number / 10;
		}
		
		return r;
	}

}
