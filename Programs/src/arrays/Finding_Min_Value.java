package arrays;

import java.util.Scanner;
/**
 * This program finds the minimum value in the array
 * @author deepika
 *
 */

public class Finding_Min_Value {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter elements into the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int min = findingminvalue(array);
		System.out.println("Minimum value in array " + min);

	}

	public static int findingminvalue(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

}
