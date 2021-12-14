package arrays;

import java.util.Scanner;

public class Max_value3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int maximumvalueis = findsmaxval(array);
		System.out.println("max value is " + maximumvalueis);

	}

	public static int findsmaxval(int[] array) {
		int max = Integer.MIN_VALUE;
		//minvalue = -9999999999999999999999.... if array consists of negative values best approach
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}

		}
		return max;
	}

}
