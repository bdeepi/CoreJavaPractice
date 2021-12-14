package arrays;

import java.util.Scanner;

/**
 * This program finds the max value in the array
 * 
 * @author deepika
 * 
 */
public class Max_Value2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter elements into the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int max = findingmaxvalue(array);
		System.out.println("The maximum value in the array is " + max);

	}

	public static int findingmaxvalue(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

}
