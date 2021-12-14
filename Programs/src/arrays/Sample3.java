package arrays;

import java.util.Scanner;

public class Sample3 {

	/**
	 * This program will read an array and not accepting a particular value and
	 * printing the array excluding that value 
	 * author @deepika
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter elements into the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] == 22) {
				i--;

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("Array is " + a[i]);

		}

	}

}
