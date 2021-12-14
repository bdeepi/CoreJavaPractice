package arrays;

import java.util.Scanner;
/**
 * This program will end its loop when entering particular number and prints
 * the array elements excluding the particular number
 * 
 * @author deepika
 *
 */
public class Sample2 {

	/**
	 * This program will end its loop when entering particular number and prints
	 * the array elements excluding the particular number
	 * 
	 *
	 */
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		int array[] = new int[1000];
		System.out.println("Enter elements into the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if (array[i] == 22) {
				n = i;
				break;
			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println("the elements after excluding the value 22 in the array are"
					+ array[i]);
					
		}

	}

}
