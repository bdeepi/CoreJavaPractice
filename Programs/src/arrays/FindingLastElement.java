package arrays;

import java.util.Scanner;

/**
 * This programs finds the last element present in the array
 * 
 * @author deepika
 * 
 */
public class FindingLastElement {

	public static void main(String[] args) {
		int index = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements into the array");
		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			index = array[i];
		}
		System.out.println("Last element in the array is " + index);
	}

}
