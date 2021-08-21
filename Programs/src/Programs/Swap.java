package Programs;

import java.util.Scanner;
/**
 * This program performs swapping of two numbers
 * @author deepika
 *
 */

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp;
		temp = a; 
		a = b; 
		b = temp;
		System.out.println("Swap of a & b is " +  a + " "  +  b );

  }
}
