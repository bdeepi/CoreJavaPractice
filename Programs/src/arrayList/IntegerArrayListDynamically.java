package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program takes input from the user and prints the Integer type array list
 * dynamically
 * 
 * @author deepika
 * 
 */

public class IntegerArrayListDynamically {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter elements into the arraylist");
		for (int i = 0; i < 5; i++) {
			al.add(sc.nextInt());
		}
		al.add(66);
		al.remove(2);
		System.out.println("The Integer array list is " + al);

	}
}
