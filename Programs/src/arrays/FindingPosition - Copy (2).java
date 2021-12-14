package arrays;

import java.util.Scanner;

public class FindingPosition {

	public static void main(String[] args) {
		boolean flag = true;
		int index = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element  ");
		int key = sc.nextInt();
		int array[] = new int[5];
		System.out.println("Enter elements into the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				index = i;
				flag = true;

			}
		}
		if (flag) {
			System.out.println("Element found at index " + index);
		} else {
			System.out.println("Element not found ");
		}

	}

}
