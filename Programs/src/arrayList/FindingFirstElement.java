package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.OutputUtil;

/**
 * This programs finds out the first element in the arraylist
 * 
 * @author admin
 * 
 */

public class FindingFirstElement {

	public static void main(String[] args) {
		int index = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements into the array list");
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			al.add(sc.nextInt());
		}
		
		System.out.println(al.get(0));
		
		for (int i = 0; i < al.size(); i++) {
			index = al.get(i);
			System.out.println("The first element in the array list is "
					+ index);
			break;

		}

	}

}
