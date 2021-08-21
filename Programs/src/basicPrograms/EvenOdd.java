package basicPrograms;

import java.util.Scanner;
/**
 * This programs finds out whether the given number is even or odd
 * @author Deepika
 *
 */

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean iseven = evenOrOdd(n);
		if(iseven) {
			System.out.println("the given number is even " + n);
		}
		else {
			System.out.println("the given number is odd " + n);
			
		}
	

	}
	/**
	 * This method finds out whether the given number is even or odd
	 * @param n -> An integer number
	 * @return true / false -> if even (true) else (false) 
	 */
	public static boolean evenOrOdd(int n) {
		if(n % 2 == 0){
			return true;
		}
		else
		{
			return false;
		}
	}

}
