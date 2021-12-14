package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program finds the last element present in the array list
 * 
 * @author deepika
 * 
 */

public class FindingLastElement {
	public static void main(String[] args) {
		int index = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements into the array list");
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			al.add(sc.nextInt());
		}
		for (int i = 0; i < al.size(); i++) {
			index = al.get(i);
		}
		System.out.println("Last element present in the array list is " + index);

	}

}
