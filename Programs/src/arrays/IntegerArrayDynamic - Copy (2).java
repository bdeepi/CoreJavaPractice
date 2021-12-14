package arrays;

import java.util.Scanner;
/**
 * This program reads the elements from the user and print the integer array of elements 
 * @author admin
 *
 */

public class IntegerArrayDynamic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("enter elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("array elements at index: " + i + " " + array[i] + " ");
		}

	}

}
