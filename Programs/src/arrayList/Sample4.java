package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program takes input array elements as 10,20,30,40..90 and checks how
 * many times the elements occur
 * 
 * @author deepika
 * 
 */
public class Sample4 {

	public static void main(String[] args) {
		int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0, a9 = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter elements into the arraylist");
		for (int i = 0; i < 5; i++) {
			al.add(sc.nextInt());
		}
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) == 10) {
				a1++;
			} else if (al.get(i) == 20) {
				a2++;
			} else if (al.get(i) == 30) {
				a3++;
			} else if (al.get(i) == 40) {
				a4++;
			} else if (al.get(i) == 50) {
				a5++;
			} else {
				i--;
			}

		}

		if (a1 > 0 ) {
			System.out.println(" 10 occured " + a1);
		}
		if (a2 > 0) {
			System.out.println(" 20 occured " + a2);
		}
		if (a3 > 0) {
			System.out.println("30 occured " + a3);
		}
		if (a4 > 0) {
			System.out.println("40 occured " + a4);
		}
		if (a5 > 0) {
			System.out.println(" 50 occured " + a5);
		}

	}

}
