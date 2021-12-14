package arrays;

import java.util.Scanner;

public class FindingNumberOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter elements to be entered into array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Number of elements present in the array are "
				+ array.length);

	}

}
