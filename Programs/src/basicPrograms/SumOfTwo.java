package basicPrograms;

import java.util.Scanner;
/**
 * This program is the example for method overloading, it performs the addition of the given numbers
 * Method overloading -> Same methods in the same class with different signature/parameters , may be the number of parameters or different data types of the parameters
 * @author admin
 *
 */

//method overloading
public class SumOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int addtwo = AddOfTwo(a, b);
		int sumofthree = AddOfTwo(a, b, c);
		System.out.println("Addition of two numbers " + addtwo);
		System.out.println("Addition of three numbers " + sumofthree);

	}
	/**
	 * This method performs the addition of two numbers
	 * @param x
	 * @param y
	 * @return addition of two numbers
	 */

	public static int AddOfTwo(int x, int y) {
		int z;
		z = x + y;
		return z;

	}
	/**
	 * This method performs the addition of three numbers
	 * @param x
	 * @param y
	 * @param z
	 * @return sum of the 3 numbers
	 */
	public static int AddOfTwo(int x, int y, int z) {
		int s;
		s = x + y + z;
		return s;
	}

}
