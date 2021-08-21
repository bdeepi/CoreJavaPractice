package basicPrograms;

import java.util.Scanner;
/**
 * This program performs the multiplication operation of two numbers
 * @author Deepika
 *
 */
public class Multiplication {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = Product(a, b);
	System.out.println("product of two numbers " + c);

	}
	/**
	 * This method performs multiplication operation 
	 * @param a - first number
	 * @param b - second number
	 * @return c -> the result of a * b 
	 */
	public static int Product(int a, int b){
		int c;
		c = a * b;
		return c;
		
	}

}
