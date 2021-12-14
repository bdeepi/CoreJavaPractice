package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program finds whether the given element is present or not if present print the count with index
 * 
 * 
 * @author deepika
 * 
 */
public class Sample3 {

	public static void main(String[] args) {
		int n = 5, count = 0, index = -1;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		System.out.println("Enter elements into the array");
		for (int i = 0; i < 5; i++) {
			al.add(sc.nextInt());
		}
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) == n) {
				count++;
				index = i;
				al1.add(i);
			}
		}
		for(int i = 0; i < al1.size(); i++){
		System.out.println(al1.get(i) +" " + count);
		}

	}
}
