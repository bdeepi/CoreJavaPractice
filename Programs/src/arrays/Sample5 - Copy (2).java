package arrays;

import java.util.Scanner;

/**
 * This program finds whether the given element is present or not if present
 * print the count of the number with index
 * 
 * @author deepika
 * 
 */
public class Sample5 {

	public static void main(String[] args) {
		int n = 5, count = 0, index = -1;
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int array[] = new int[5];
		System.out.println("Enter elements into the array ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (n == array[i]) {
				index = i;
				count++;
				flag = true;
			}
		}
			if (flag == true) {
				System.out.println(count + " " + index);
			} else {
				System.out.println("Element not found");
			}

		}

	}

