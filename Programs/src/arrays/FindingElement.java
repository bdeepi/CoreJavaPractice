package arrays;

import java.util.Scanner;

public class FindingElement {

	public static void main(String[] args) {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter key ");
		int key = sc.nextInt();
		int array[] = new int[6];
		System.out.println("Enter elements in the array ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				flag = true;

			}
		}
		if (flag) {
			System.out.println("Element found " );
		} else {
			System.out.println("Element not found");
		}
	}

}
