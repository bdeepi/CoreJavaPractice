package arrays;

import java.util.Scanner;

/**
 * This program finds the first element in the array
 * 
 * @author admin
 * 
 */

public class FindingFirstElement {

	public static void main(String[] args) {
		int index = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements into the array");
		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length;) {
			index = array[i];
			System.out.println("the first element in tha array is " + index);
			break;
		}

	}

}
