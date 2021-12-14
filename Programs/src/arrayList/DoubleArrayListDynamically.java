package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This This program takes input from the user and prints the Double type array list dynamically
 * @author deepika
 *
 */

public class DoubleArrayListDynamically {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Arraylist");
		int size = sc.nextInt();
		ArrayList<Double> al = new ArrayList<Double>();
		System.out.println("Enter elements into the arraylist");
		for(int i = 0 ; i < size; i++) {
			al.add(sc.nextDouble());
		}
		System.out.println("The double array list is " +al);

	}

}
