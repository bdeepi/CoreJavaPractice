package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program performs linear search in the array list
 * 
 * @author deepika
 * 
 */
public class FindingElement {

	public static void main(String[] args) {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element to find");
		int key = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter elements into the arraylist");
		for (int i = 0; i < 4; i++) {
			al.add(sc.nextInt());
		}
		for (int i = 0; i < al.size(); i++)
			if (key == al.get(i)) {
				flag = true;
				break;
			}
		if (flag) {
			System.out.println("Element found");
		} else {
			System.out.println("Element not found");
		}

	}

}
